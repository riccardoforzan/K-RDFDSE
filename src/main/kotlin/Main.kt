import classes.Dataset
import indexing.DatasetFolderReader
import indexing.DatasetReader
import indexing.Indexer
import org.apache.lucene.analysis.Analyzer
import org.apache.lucene.analysis.standard.StandardAnalyzer
import org.apache.lucene.search.similarities.ClassicSimilarity
import org.apache.lucene.search.similarities.Similarity
import search.Searcher
import java.io.FileWriter
import java.io.PrintWriter
import java.nio.file.Paths

fun main(args: Array<String>) {

    // TODO: Parse from cl which similarity to use
    // TODO: Parse from cl the directory that contains all the JSON file to index
    // TODO: Parse from cl the run ID

    val path = Paths.get("").toAbsolutePath().toString()
    println("Working directory: $path")

    // Create the analyzer
    val analyzer: Analyzer = StandardAnalyzer()

    // Set the similarity
    val similarity: Similarity = ClassicSimilarity()

    // Retrieve the path to all the datasets
    val metadataFiles = DatasetFolderReader("datasets/").getMetadataFilesPath()

    // Create the indexer
    val indexer = Indexer("index/", analyzer, similarity)

    // Load all datasets
    val datasets: List<Dataset> = metadataFiles!!.map { filePath -> DatasetReader(filePath).readJSON() }

    /*
    // INDEXING
    println("Indexing...")
    indexer.index(datasets)
    println("Indexing complete")
     */

    // QUERY
    var runID: String
    var writer: PrintWriter
    val searcher = Searcher("index/", analyzer, similarity, "queries/all_queries.txt", 100)

    runID = "META-ONLY"
    println("Querying $runID ...")
    val metaSearchOutputFile = FileWriter("output/$runID-output.txt")
    writer = PrintWriter(metaSearchOutputFile)
    searcher.searchInMetadataOnly(runID, writer)
    writer.close()
    println("Completed")

    runID = "EXTRACTED-ONLY"
    println("Querying $runID ...")
    val extractedSearchOutputFile = FileWriter("output/$runID-output.txt")
    writer = PrintWriter(extractedSearchOutputFile)
    searcher.searchInExtractedDataOnly(runID, writer)
    writer.close()
    println("Completed")

    runID = "META+EXTRACTED"
    println("Querying $runID ...")
    val metaAndExtractedSearchOutputFile = FileWriter("output/$runID-output.txt")
    writer = PrintWriter(metaAndExtractedSearchOutputFile)
    searcher.searchInExtractedDataOnly(runID, writer)
    writer.close()
    println("Completed")

}