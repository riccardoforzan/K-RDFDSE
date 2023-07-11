import indexing.DatasetFolderReader
import indexing.Indexer
import org.apache.logging.log4j.LogManager
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

    // Max number of retrieved documents
    val maxNumberOfDocuments = 20

    // Create the analyzer
    var analyzer: Analyzer
    val classloader = Thread.currentThread().contextClassLoader

    // Analyzer without stoplist
    analyzer = StandardAnalyzer()

    // Analyzer with NLTK stoplist
    // val NLTKStoplist = classloader.getResourceAsStream("stoplists/nltk_en.txt")!!.reader()
    // analyzer = StandardAnalyzer(NLTKStoplist)

    // Analyzer with big stoplist
    // val bigStopList = classloader.getResourceAsStream("stoplists/big_en.txt")!!.reader()
    // analyzer = StandardAnalyzer(bigStopList)

    // Creating the index
    val indexFolder = "index/"
    val metadataFiles = DatasetFolderReader(datasetsFolderPath).getMetadataFilesPath()!!.sorted()

    createIndex(datasetsFolderPath, analyzer, metadataFiles, indexFolder)

    // Run using an implementation of TF-IDF Similarity
    produceResults(indexFolder, analyzer, ClassicSimilarity(), "CS", maxNumberOfDocuments)

    // Run using an implementation of BM25 Similarity
    produceResults(indexFolder, analyzer, BM25Similarity(), "BM25", maxNumberOfDocuments)

    // Run using an implementation of Dirichlet Similarity
    produceResults(indexFolder, analyzer, LMDirichletSimilarity(), "LMD", maxNumberOfDocuments)
}

/**
 * @param datasetsFolderPath path in which datasets are stored
 * @param analyzer type of analyzer to use
 * @param metadataFiles list of all the metadata files, containing data that will be indexed
 * @param indexFolder folder of the file system in which the index will be stored
 */
fun createIndex(datasetsFolderPath: String, analyzer: Analyzer, metadataFiles: List<String>, indexFolder: String) {
    val logger = LogManager.getLogger()
    logger.info("Creating index in $indexFolder")
    val indexer = Indexer(datasetsFolderPath, indexFolder, analyzer, true)
    indexer.indexFiles(metadataFiles)
    logger.info("Indexing complete!")
}


/**
 * Run all the queries (SYNTHETIC + TREC + ALL) using the given settings
 * @param indexFolder folder of the file system in which the index is stored
 * @param analyzer type of analyzer to use
 * @param similarity type of similarity to use
 * @param similarityIdentifier string that will be used in the name of the directory containing the index and in the output files to identify the run parameters
 * @param maxNumberOfDocuments maximum number of retrieved documents
 */
fun produceResults(
    indexFolder: String,
    analyzer: Analyzer,
    similarity: Similarity,
    similarityIdentifier: String,
    maxNumberOfDocuments: Int
) {

    val logger = LogManager.getLogger()

    var writer: PrintWriter
    var searcher: Searcher
    var runID: String
    var outputFile: FileWriter

    // PERFORM SYNTHETIC QUERIES

    searcher = Searcher(indexFolder, analyzer, similarity, "queries/synthetic_queries.txt", maxNumberOfDocuments)

    runID = "$similarityIdentifier-META-ONLY-SYN-QUERIES"
    logger.info("Querying $runID ...")
    outputFile = FileWriter("output/$runID-output.txt")
    writer = PrintWriter(outputFile)
    searcher.searchInMetadataOnly(runID, writer)
    writer.close()
    logger.info("Completed")

    runID = "$similarityIdentifier-EXTRACTED-ONLY-SYN-QUERIES"
    logger.info("Querying $runID ...")
    outputFile = FileWriter("output/$runID-output.txt")
    writer = PrintWriter(outputFile)
    searcher.searchInExtractedDataOnly(runID, writer)
    writer.close()
    logger.info("Completed")

    runID = "$similarityIdentifier-META+EXTRACTED-SYN-QUERIES"
    logger.info("Querying $runID ...")
    outputFile = FileWriter("output/$runID-output.txt")
    writer = PrintWriter(outputFile)
    searcher.searchAcrossAllData(runID, writer)
    writer.close()
    logger.info("Completed")

    // PERFORM TREC QUERIES

    searcher = Searcher(indexFolder, analyzer, similarity, "queries/trec_queries.txt", maxNumberOfDocuments)

    runID = "$similarityIdentifier-META-ONLY-TREC-QUERIES"
    logger.info("Querying $runID ...")
    outputFile = FileWriter("output/$runID-output.txt")
    writer = PrintWriter(outputFile)
    searcher.searchInMetadataOnly(runID, writer)
    writer.close()
    logger.info("Completed")

    runID = "$similarityIdentifier-EXTRACTED-ONLY-TREC-QUERIES"
    logger.info("Querying $runID ...")
    outputFile = FileWriter("output/$runID-output.txt")
    writer = PrintWriter(outputFile)
    searcher.searchInExtractedDataOnly(runID, writer)
    writer.close()
    logger.info("Completed")

    runID = "$similarityIdentifier-META+EXTRACTED-TREC-QUERIES"
    logger.info("Querying $runID ...")
    outputFile = FileWriter("output/$runID-output.txt")
    writer = PrintWriter(outputFile)
    searcher.searchAcrossAllData(runID, writer)
    writer.close()
    logger.info("Completed")

    // PERFORM ALL QUERIES

    searcher = Searcher(indexFolder, analyzer, similarity, "queries/all_queries.txt", maxNumberOfDocuments)

    runID = "$similarityIdentifier-META-ONLY-ALL-QUERIES"
    logger.info("Querying $runID ...")
    outputFile = FileWriter("output/$runID-output.txt")
    writer = PrintWriter(outputFile)
    searcher.searchInMetadataOnly(runID, writer)
    writer.close()
    logger.info("Completed")

    runID = "$similarityIdentifier-EXTRACTED-ONLY-ALL-QUERIES"
    logger.info("Querying $runID ...")
    outputFile = FileWriter("output/$runID-output.txt")
    writer = PrintWriter(outputFile)
    searcher.searchInExtractedDataOnly(runID, writer)
    writer.close()
    logger.info("Completed")

    runID = "$similarityIdentifier-META+EXTRACTED-ALL-QUERIES"
    logger.info("Querying $runID ...")
    outputFile = FileWriter("output/$runID-output.txt")
    writer = PrintWriter(outputFile)
    searcher.searchAcrossAllData(runID, writer)
    writer.close()
    logger.info("Completed")

}