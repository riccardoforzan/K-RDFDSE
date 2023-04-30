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

            doc.add(MetadataField(DocumentField.ID.name, dataset.id))
            doc.add(MetadataField(DocumentField.TITLE.name, dataset.title))
            doc.add(MetadataField(DocumentField.DESCRIPTION.name, dataset.description))
            doc.add(MetadataField(DocumentField.AUTHOR.name, dataset.author))
            doc.add(MetadataField(DocumentField.TAGS.name, dataset.tags))

            doc.add(MetadataField(DocumentField.CLASSES.name, dataset.classes.joinToString(' '.toString())))
            doc.add(MetadataField(DocumentField.LITERALS.name, dataset.literals.joinToString(' '.toString())))
            doc.add(MetadataField(DocumentField.ENTITIES.name, dataset.entities.joinToString(' '.toString())))
            doc.add(MetadataField(DocumentField.PROPERTIES.name, dataset.properties.joinToString(' '.toString())))

            doc.add(MetadataField(DocumentField.COUNT_DOWNLOADED_FILES.name, dataset.downloadedURLs.count().toString()))
            doc.add(MetadataField(DocumentField.COUNT_FAILED_FILES.name, dataset.failedURLs.count().toString()))
            doc.add(MetadataField(DocumentField.COUNT_USED_FILES.name, dataset.usedFiles.count().toString()))
            doc.add(MetadataField(DocumentField.COUNT_UNUSED_FILES.name, dataset.unusedFiles.count().toString()))

            doc.add(MetadataField(DocumentField.CONNECTIONS.name, dataset.connections.toString()))
            doc.add(MetadataField(DocumentField.CONNECTED_VERTICES.name, dataset.connectedVertices.toString()))
            doc.add(
                MetadataField(
                    DocumentField.AVERAGE_LITERALS_PER_VERTEX.name,
                    dataset.averageLiteralsPerVertex.toString()
                )
            )

            writer.addDocument(doc)
            indexed++

            println("Indexed $indexed of " + datasets.size)

        }

        writer.commit()
        writer.close()

    }

}