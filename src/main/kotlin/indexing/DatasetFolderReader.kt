package indexing

import java.io.File


class DatasetFolderReader(private val path: String) {

    fun getMetadataFilesPath(): List<String>? {

        val paths = ArrayList<String>()

        val files = File(this.path).listFiles { obj: File -> obj.isDirectory }

        for (file in files!!){
            val path = file.path + "/metadata-jf.json"
            if(File(path).exists()){
                paths.add(path)
            }
        }

        return paths
    }

}