package classes

data class DatasetMetadata(
    val author: String,
    val description: String,
    val downloadedURLs: List<DownloadedURL>,
    val extracted: List<Extracted>,
    val failedURLs: List<Any>,
    val id: String,
    val tags: String,
    val title: String,
    val unusedFiles: List<UnusedFile>
)