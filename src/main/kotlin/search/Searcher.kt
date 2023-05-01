package search

import indexing.DocumentField
import org.apache.lucene.analysis.Analyzer
import org.apache.lucene.index.DirectoryReader
import org.apache.lucene.index.IndexReader
import org.apache.lucene.search.IndexSearcher
import org.apache.lucene.search.ScoreDoc
import org.apache.lucene.search.similarities.Similarity
import org.apache.lucene.store.FSDirectory
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.FileReader
import java.io.PrintWriter
import java.nio.file.Paths
import java.util.*
import kotlin.collections.ArrayList

class Searcher(
    indexPath: String,
    private val analyzer: Analyzer,
    similarity: Similarity,
    queryFilePath: String,
    private val maxNumberOfDocuments: Int
) {

    data class Query(val id: Int, val text: String)

    private val reader: IndexReader
    private val searcher: IndexSearcher
    private val queries = ArrayList<Query>()

    init {
        val indexDir = Paths.get(indexPath)
        reader = DirectoryReader.open(FSDirectory.open(indexDir))
        searcher = IndexSearcher(reader)
        searcher.similarity = similarity

        val input = FileReader(queryFilePath)
        BufferedReader(input).forEachLine {
            val parts = it.split("\t")
            val query = Query(parts[0].toInt(), parts[1])
            queries.add(query)
        }

    }

    fun searchInMetadataOnly(runIdentifier: String, writer: PrintWriter) {

        val fields = arrayOf(
            DocumentField.TITLE.name,
            DocumentField.DESCRIPTION.name,
            DocumentField.AUTHOR.name,
            DocumentField.TAGS.name
        )

        for (query in queries) {
            val queryID = query.id
            val q = CustomBooleanQueryBuilder.buildQuery(fields, analyzer, query.text)
            val hits = searcher.search(q, maxNumberOfDocuments).scoreDocs
            writeHits(runIdentifier, queryID, hits, writer)
        }

    }

    fun searchInExtractedDataOnly(runIdentifier: String, writer: PrintWriter) {

        val fields = arrayOf(
            DocumentField.CLASSES.name,
            DocumentField.LITERALS.name,
            DocumentField.ENTITIES.name,
            DocumentField.PROPERTIES.name
        )

        for (query in queries) {
            val queryID = query.id
            val q = CustomBooleanQueryBuilder.buildQuery(fields, analyzer, query.text)
            val hits = searcher.search(q, maxNumberOfDocuments).scoreDocs
            writeHits(runIdentifier, queryID, hits, writer)
        }

    }

    fun searchAcrossAllDataOnly(runIdentifier: String, writer: PrintWriter) {

        val fields = arrayOf(
            DocumentField.TITLE.name,
            DocumentField.DESCRIPTION.name,
            DocumentField.AUTHOR.name,
            DocumentField.TAGS.name,
            DocumentField.CLASSES.name,
            DocumentField.LITERALS.name,
            DocumentField.ENTITIES.name,
            DocumentField.PROPERTIES.name
        )

        for (query in queries) {
            val queryID = query.id
            val q = CustomBooleanQueryBuilder.buildQuery(fields, analyzer, query.text)
            val hits = searcher.search(q, maxNumberOfDocuments).scoreDocs
            writeHits(runIdentifier, queryID, hits, writer)
        }
    }

    private fun writeHits(runIdentifier:String, queryID: Int, hits: Array<ScoreDoc>, writer: PrintWriter){
        for ((index, hit) in hits.withIndex()) {
            val doc = reader.storedFields().document(hit.doc)
            writer.printf(
                Locale.ENGLISH,
                "%s\tQ0\t%s\t%d\t%.6f\t%s%n",
                queryID,
                doc.get(DocumentField.ID.name),
                index + 1,
                hit.score,
                runIdentifier
            )
        }
    }

}