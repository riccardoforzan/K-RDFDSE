import indexing.DatasetFolderReader
import indexing.Indexer
import org.apache.lucene.analysis.Analyzer
import org.apache.lucene.analysis.standard.StandardAnalyzer
import org.apache.lucene.search.similarities.BM25Similarity
import org.apache.lucene.search.similarities.ClassicSimilarity
import org.apache.lucene.search.similarities.LMDirichletSimilarity
import org.apache.lucene.search.similarities.Similarity
import search.Searcher
import java.io.FileWriter
import java.io.PrintWriter
import java.nio.file.Paths

fun main(args: Array<String>) {

    val datasetsFolderPath = "../datasets"
    val path = Paths.get("").toAbsolutePath().toString()
    println("Working directory: $path, Datasets in $datasetsFolderPath")

    val maxNumberOfDocuments = 100
    val analyzer: Analyzer = StandardAnalyzer()
    val metadataFiles = DatasetFolderReader(datasetsFolderPath).getMetadataFilesPath()!!.sorted()

    // run using an implementation of TF-IDF Similarity
    produceResults(datasetsFolderPath, analyzer, ClassicSimilarity(), "CS", metadataFiles, maxNumberOfDocuments)

    // run using an implementation of BM25 Similarity
    produceResults(datasetsFolderPath, analyzer, BM25Similarity(), "BM25", metadataFiles, maxNumberOfDocuments)

    // run using an implementation of Dirichlet Similarity
    produceResults(datasetsFolderPath, analyzer, LMDirichletSimilarity(), "LMD", metadataFiles, maxNumberOfDocuments)
}

/**
 * Run all the queries (SYNTHETIC + TREC + ALL) using the given settings
 * @param datasetsFolderPath path in which datasets are stored
 * @param analyzer type of analyzer to use
 * @param similarity type of similarity to use
 * @param similarityIdentifier string that will be used in the name of the directory containing the index and in the output files to identify the run parameters
 * @param metadataFiles list of all the metadata files, containing data that will be indexed
 * @param maxNumberOfDocuments maximum number of retrieved documents
 */
fun produceResults(
    datasetsFolderPath: String,
    analyzer: Analyzer,
    similarity: Similarity,
    similarityIdentifier: String,
    metadataFiles: List<String>,
    maxNumberOfDocuments: Int
) {

    val indexFolder = "index-$similarityIdentifier/"

    println("Indexing using classic similarity in $indexFolder")
    val indexer = Indexer(datasetsFolderPath, indexFolder, analyzer, similarity)
    indexer.indexFiles(metadataFiles)
    println("Indexing complete! ")

    var writer: PrintWriter
    var searcher: Searcher
    var runID: String
    var outputFile: FileWriter

    // PERFORM SYNTHETIC QUERIES

    searcher = Searcher(indexFolder, analyzer, similarity, "queries/synthetic_queries.txt", maxNumberOfDocuments)

    runID = "$similarityIdentifier-META-ONLY-SYN-QUERIES"
    println("Querying $runID ...")
    outputFile = FileWriter("output/$runID-output.txt")
    writer = PrintWriter(outputFile)
    searcher.searchInMetadataOnly(runID, writer)
    writer.close()
    println("Completed")

    runID = "$similarityIdentifier-EXTRACTED-ONLY-SYN-QUERIES"
    println("Querying $runID ...")
    outputFile = FileWriter("output/$runID-output.txt")
    writer = PrintWriter(outputFile)
    searcher.searchInExtractedDataOnly(runID, writer)
    writer.close()
    println("Completed")

    runID = "$similarityIdentifier-META+EXTRACTED-SYN-QUERIES"
    println("Querying $runID ...")
    outputFile = FileWriter("output/$runID-output.txt")
    writer = PrintWriter(outputFile)
    searcher.searchAcrossAllData(runID, writer)
    writer.close()
    println("Completed")

    // PERFORM TREC QUERIES

    searcher = Searcher(indexFolder, analyzer, similarity, "queries/trec_queries.txt", maxNumberOfDocuments)

    runID = "$similarityIdentifier-META-ONLY-TREC-QUERIES"
    println("Querying $runID ...")
    outputFile = FileWriter("output/$runID-output.txt")
    writer = PrintWriter(outputFile)
    searcher.searchInMetadataOnly(runID, writer)
    writer.close()
    println("Completed")

    runID = "$similarityIdentifier-EXTRACTED-ONLY-TREC-QUERIES"
    println("Querying $runID ...")
    outputFile = FileWriter("output/$runID-output.txt")
    writer = PrintWriter(outputFile)
    searcher.searchInExtractedDataOnly(runID, writer)
    writer.close()
    println("Completed")

    runID = "$similarityIdentifier-META+EXTRACTED-TREC-QUERIES"
    println("Querying $runID ...")
    outputFile = FileWriter("output/$runID-output.txt")
    writer = PrintWriter(outputFile)
    searcher.searchAcrossAllData(runID, writer)
    writer.close()
    println("Completed")

    // PERFORM ALL QUERIES

    searcher = Searcher(indexFolder, analyzer, similarity, "queries/all_queries.txt", maxNumberOfDocuments)

    runID = "$similarityIdentifier-META-ONLY-ALL-QUERIES"
    println("Querying $runID ...")
    outputFile = FileWriter("output/$runID-output.txt")
    writer = PrintWriter(outputFile)
    searcher.searchInMetadataOnly(runID, writer)
    writer.close()
    println("Completed")

    runID = "$similarityIdentifier-EXTRACTED-ONLY-ALL-QUERIES"
    println("Querying $runID ...")
    outputFile = FileWriter("output/$runID-output.txt")
    writer = PrintWriter(outputFile)
    searcher.searchInExtractedDataOnly(runID, writer)
    writer.close()
    println("Completed")

    runID = "$similarityIdentifier-META+EXTRACTED-ALL-QUERIES"
    println("Querying $runID ...")
    outputFile = FileWriter("output/$runID-output.txt")
    writer = PrintWriter(outputFile)
    searcher.searchAcrossAllData(runID, writer)
    writer.close()
    println("Completed")

}