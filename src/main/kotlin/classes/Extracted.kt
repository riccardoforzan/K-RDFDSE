package classes

data class Extracted(
    val averageLiteralsPerVertex: Double,
    val classesFile: String,
    val connectedVertices: Int,
    val connections: Int,
    val entitiesFile: String,
    val extractedWith: String,
    val file: String,
    val literalsFile: String,
    val propertiesFile: String,
    val size: Int
)