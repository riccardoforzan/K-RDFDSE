package utils

import org.apache.lucene.analysis.CharArraySet
import org.apache.lucene.analysis.WordlistLoader
import java.io.*


class AnalyzerUtil {

    fun loadStopList(stopFile: String): CharArraySet? {
        var stopList: CharArraySet? = null
        try {
            // Get a reader for the file containing the stop list
            val reader: Reader = FileInputStream(stopFile).bufferedReader()

            // Read the stop list
            stopList = WordlistLoader.getWordSet(reader)

            // Close the file
            reader.close()
        } catch (e: IOException) {
            throw IllegalStateException(String.format("Unable to load the stop list %s: %s", stopFile, e.message), e)
        }
        return stopList
    }

}