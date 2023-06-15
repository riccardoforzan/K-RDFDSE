package indexing

import classes.DatasetMetadata
import indexing.fields.DataField
import indexing.fields.MetadataField
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import org.apache.lucene.analysis.Analyzer
import org.apache.lucene.document.Document
import org.apache.lucene.index.IndexWriter
import org.apache.lucene.index.IndexWriterConfig
import org.apache.lucene.search.similarities.Similarity
import org.apache.lucene.store.FSDirectory
import java.io.BufferedReader
import java.io.File
import java.io.FileInputStream
import java.io.InputStreamReader
import java.nio.charset.Charset

class Indexer(private val datasetsFolderPath: String, indexPath: String, analyzer: Analyzer, similarity: Similarity) {

    private var writer: IndexWriter
    private var logger: Logger

    init {
        val iwc = IndexWriterConfig(analyzer)
        iwc.similarity = similarity
        iwc.ramBufferSizeMB = 2048.0
        iwc.openMode = IndexWriterConfig.OpenMode.CREATE
        iwc.commitOnClose = true
        iwc.useCompoundFile = true

        // If the index directory does not already exist then create it
        val indexDirectory = File(indexPath)
        if (!indexDirectory.exists() || !indexDirectory.isDirectory) {
            indexDirectory.mkdirs()
        }

        // Create the index writer
        this.writer = IndexWriter(FSDirectory.open(indexDirectory.toPath()), iwc)

        // Create the logger
        this.logger= LogManager.getLogger()
    }

    fun indexFiles(files: List<String>) {
        val tot = files.size.toString()
        for ((index, file) in files.withIndex()) {
            val dataset = DatasetReader(file).readJSON()
            logger.info("Indexing " + (index + 1) + " of $tot - Dataset ID ${dataset.id}")
            index(dataset)
        }

        writer.commit()
        writer.close()
    }

    private fun index(dataset: DatasetMetadata) {

        val doc = Document()

        doc.add(MetadataField(DocumentField.ID.name, dataset.id))
        doc.add(MetadataField(DocumentField.TITLE.name, dataset.title))
        doc.add(MetadataField(DocumentField.DESCRIPTION.name, dataset.description))
        doc.add(MetadataField(DocumentField.AUTHOR.name, dataset.author))
        doc.add(MetadataField(DocumentField.TAGS.name, dataset.tags))

        // Add extracted fields
        val basePath = "$datasetsFolderPath/${dataset.id}/"
        for (extracted in dataset.extracted) {
            logger.info("Reading from file ${basePath + extracted.classesFile}")
            appendDataFromFile(basePath + extracted.classesFile, DocumentField.CLASSES.name, doc)

            logger.info("Reading from file ${basePath + extracted.literalsFile}")
            appendDataFromFile(basePath + extracted.literalsFile, DocumentField.LITERALS.name, doc)

            logger.info("Reading from file ${basePath + extracted.entitiesFile}")
            appendDataFromFile(basePath + extracted.entitiesFile, DocumentField.ENTITIES.name, doc)

            logger.info("Reading from file ${basePath + extracted.propertiesFile}")
            appendDataFromFile(basePath + extracted.propertiesFile, DocumentField.PROPERTIES.name, doc)
        }

        try {
            writer.addDocument(doc)
            logger.info("Dataset ${dataset.id} indexed")
        }catch (e: Exception){
            logger.error("Dataset ${dataset.id} not indexed ${e.localizedMessage}")
        }
    }

    /**
     * Appends each line of the file as DataField with the specified name to the document
     * @param path path of the file
     * @param fieldName name of the DataField
     * @param doc Lucene Document that will be modified
     */
    private fun appendDataFromFile(path: String, fieldName: String, doc: Document) {
        FileInputStream(path).use { fileInputStream ->
            BufferedReader(InputStreamReader(fileInputStream, Charset.forName("UTF-8"))).use { reader ->
                var line: String? = reader.readLine()
                while (line != null) {
                    doc.add(DataField(fieldName, line))
                    line = reader.readLine()
                }
            }
        }
    }

}