package indexing

import classes.DatasetMetadata
import indexing.fields.DataField
import indexing.fields.MetadataField
import org.apache.lucene.analysis.Analyzer
import org.apache.lucene.document.Document
import org.apache.lucene.index.IndexWriter
import org.apache.lucene.index.IndexWriterConfig
import org.apache.lucene.search.similarities.Similarity
import org.apache.lucene.store.FSDirectory
import java.io.BufferedReader
import java.io.File
import java.nio.charset.Charset

class Indexer(private val datasetsFolderPath: String, indexPath: String, analyzer: Analyzer, similarity: Similarity) {

    private var writer: IndexWriter

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
    }

    fun indexFiles(files: List<String>) {
        val tot = files.size.toString()
        for ((index, file) in files.withIndex()) {
            val dataset = DatasetReader(file).readJSON()
            println("Indexing " + (index + 1) + " of $tot - Dataset ID ${dataset.id}")
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
            appendDataFromFile(basePath + extracted.classesFile, DocumentField.CLASSES.name, doc)
            appendDataFromFile(basePath + extracted.literalsFile, DocumentField.LITERALS.name, doc)
            appendDataFromFile(basePath + extracted.entitiesFile, DocumentField.ENTITIES.name, doc)
            appendDataFromFile(basePath + extracted.propertiesFile, DocumentField.PROPERTIES.name, doc)
        }

        writer.addDocument(doc)
    }

    /**
     * Appends each line of the file as DataField with the specified name to the document
     * @param path path of the file
     * @param fieldName name of the DataField
     * @param doc Lucene Document that will be modified
     */
    private fun appendDataFromFile(path: String, fieldName: String, doc: Document) {

        val file = File(path)
        val charset = Charset.forName("UTF-8")

        file.bufferedReader(charset).use { reader: BufferedReader ->
            var line: String? = reader.readLine()
            while (line != null) {
                doc.add(DataField(fieldName, line))
                line = reader.readLine()
            }
        }

    }

}