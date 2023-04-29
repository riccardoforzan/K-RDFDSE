import classes.Dataset
import indexing.DatasetFolderReader
import indexing.DatasetReader
import indexing.Indexer
import org.apache.lucene.analysis.Analyzer
import org.apache.lucene.analysis.standard.StandardAnalyzer
import org.apache.lucene.search.similarities.ClassicSimilarity
import org.apache.lucene.search.similarities.Similarity
import java.nio.file.Paths

fun main(args: Array<String>) {

    // TODO: Parse from cl which similarity to use
    // TODO: Parse from cl the directory that contains all the JSON file to index

    val path = Paths.get("").toAbsolutePath().toString()
    println("Working directory: $path")

    // Retrieve the path to all the datasets
    val metadataFiles = DatasetFolderReader("datasets/").getMetadataFilesPath()

    // Create the analyzer
    val analyzer: Analyzer = StandardAnalyzer()

    // Set the similarity
    val similarity: Similarity = ClassicSimilarity()

    // Create the indexer
    val indexer = Indexer("index/", analyzer, similarity)

    // Load all datasets
    val datasets: List<Dataset> = metadataFiles!!.map { filePath -> DatasetReader(filePath).readJSON() }

    // Index all the metadata files fount in the dataset folder
    indexer.index(datasets)

    println("Indexing complete")

}