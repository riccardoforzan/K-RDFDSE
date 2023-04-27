import classes.Dataset
import indexing.DatasetFolderReader
import indexing.DatasetReader
import indexing.Indexer
import org.apache.lucene.analysis.Analyzer
import org.apache.lucene.analysis.CharArraySet
import org.apache.lucene.analysis.standard.StandardAnalyzer
import org.apache.lucene.search.similarities.ClassicSimilarity
import org.apache.lucene.search.similarities.Similarity
import utils.AnalyzerUtil


fun main(args: Array<String>) {

    // TODO: Parse from cl which similarity to use

    // Retrieve the path to all the datasets
    val metadataFiles = DatasetFolderReader("datasets/").getMetadataFilesPath()

    // Create the analyzer
    val cas: CharArraySet? = AnalyzerUtil().loadStopList("resources/nltk-stopwords.txt")
    val analyzer: Analyzer = StandardAnalyzer(cas)

    // Set the similarity
    val similarity: Similarity = ClassicSimilarity()

    // Create the indexer
    val indexer = Indexer("index/", analyzer, similarity)

    // Load all datasets
    val datasets: List<Dataset> = metadataFiles!!.map { filePath -> DatasetReader(filePath).readJSON() }

    // Index all the metadata files fount in the dataset folder
    indexer.index(datasets)

}