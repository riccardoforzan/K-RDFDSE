package indexing

import classes.DatasetMetadata
import com.google.gson.Gson
import java.io.File
import java.io.InputStream

class DatasetReader(private val datasetPath: String) {

    private val gson = Gson()

    fun readJSON(): DatasetMetadata {
        val inputStream: InputStream = File(this.datasetPath).inputStream()
        val content = inputStream.bufferedReader().use { it.readText() }
        return gson.fromJson(content, DatasetMetadata::class.java)
    }

}