package indexing

import classes.Dataset
import com.google.gson.Gson
import java.io.File
import java.io.InputStream

class DatasetReader(private val datasetPath: String) {

    private val gson = Gson()

    fun readJSON(): Dataset {
        val inputStream: InputStream = File(this.datasetPath).inputStream()
        val content = inputStream.bufferedReader().use { it.readText() }
        return gson.fromJson(content, Dataset::class.java)
    }

}