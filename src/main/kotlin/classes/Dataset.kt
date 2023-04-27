package classes

data class Dataset(
    val author: String,
    val averageLiteralsPerVertex: Double,
    val classes: List<String>,
    val connectedVertices: Int,
    val connections: Int,
    val description: String,
    val downloadedURLs: List<DownloadedURL>,
    val entities: List<String>,
    val failedURLs: List<Any>,
    val id: String,
    val literals: List<String>,
    val properties: List<String>,
    val tags: String,
    val title: String,
    val unusedFiles: List<Any>,
    val usedFiles: List<String>
)