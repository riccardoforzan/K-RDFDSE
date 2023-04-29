package indexing

import classes.Dataset
import org.apache.lucene.analysis.Analyzer
import org.apache.lucene.document.Document
import org.apache.lucene.index.IndexWriter
import org.apache.lucene.index.IndexWriterConfig
import org.apache.lucene.search.similarities.Similarity
import org.apache.lucene.store.FSDirectory
import java.io.File

class Indexer(indexPath: String, analyzer: Analyzer, similarity: Similarity) {

    private var writer: IndexWriter

    init {
        val iwc = IndexWriterConfig(analyzer)
        iwc.similarity = similarity
        iwc.openMode = IndexWriterConfig.OpenMode.CREATE
        iwc.commitOnClose = true

        // If the index directory does not already exist then create it
        val indexDirectory = File(indexPath)
        if (!indexDirectory.exists() || !indexDirectory.isDirectory) {
            indexDirectory.mkdirs()
        }

        // Create the index writer
        this.writer = IndexWriter(FSDirectory.open(indexDirectory.toPath()), iwc)
    }

    fun index(datasets: List<Dataset>) {

        var indexed = 0

        for (dataset in datasets) {
            val doc = Document()

            doc.add(MetadataField("ID", dataset.id))
            doc.add(MetadataField("TITLE", dataset.title))
            doc.add(MetadataField("DESCRIPTION", dataset.description))
            doc.add(MetadataField("AUTHOR", dataset.author))
            doc.add(MetadataField("TAGS", dataset.tags))

            doc.add(MetadataField("CLASSES", dataset.classes.joinToString()))
            doc.add(MetadataField("LITERALS", dataset.classes.joinToString()))
            doc.add(MetadataField("ENTITIES", dataset.classes.joinToString()))
            doc.add(MetadataField("PROPERTIES", dataset.classes.joinToString()))

            doc.add(MetadataField("URLS-DOWNLOADED", dataset.downloadedURLs.count().toString()))
            doc.add(MetadataField("URLS-FAILED", dataset.downloadedURLs.count().toString()))
            doc.add(MetadataField("USED-FILES", dataset.usedFiles.count().toString()))
            doc.add(MetadataField("UNUSED-FILES", dataset.unusedFiles.count().toString()))

            doc.add(MetadataField("CONNECTIONS", dataset.connections.toString()))
            doc.add(MetadataField("CONNECTED-VERTICES", dataset.connectedVertices.toString()))
            doc.add(MetadataField("AVERAGE-LITERALS-PER-VERTEX", dataset.averageLiteralsPerVertex.toString()))

            writer.addDocument(doc)
            indexed++

            println("Indexed $indexed of " + datasets.size)

        }

        writer.commit()
        writer.close()

    }

}