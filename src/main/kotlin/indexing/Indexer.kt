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
            println("Indexing " + (index + 1) + " of $tot")
            val dataset = DatasetReader(file).readJSON()
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

        val basePath = "$datasetsFolderPath/${dataset.id}/"

        val classes = StringBuilder()
        val literals = StringBuilder()
        val entities = StringBuilder()
        val properties = StringBuilder()

        for (extracted in dataset.extracted) {
            classes.append(stringFromFile(basePath + extracted.classesFile))
            literals.append(stringFromFile(basePath + extracted.literalsFile))
            entities.append(stringFromFile(basePath + extracted.entitiesFile))
            properties.append(stringFromFile(basePath + extracted.propertiesFile))
        }

        doc.add(DataField(DocumentField.CLASSES.name, classes.toString()))
        doc.add(DataField(DocumentField.LITERALS.name, literals.toString()))
        doc.add(DataField(DocumentField.ENTITIES.name, entities.toString()))
        doc.add(DataField(DocumentField.PROPERTIES.name, properties.toString()))

        writer.addDocument(doc)

    }

    private fun stringFromFile(filePath: String): String {
        val file = File(filePath)

        val stringBuilder = StringBuilder()
        val charset = Charset.forName("UTF-8")

        file.bufferedReader(charset).use { reader: BufferedReader ->
            var line: String? = reader.readLine()
            while (line != null) {
                stringBuilder.append("$line ")
                line = reader.readLine()
            }
        }

        return stringBuilder.toString()
    }

}