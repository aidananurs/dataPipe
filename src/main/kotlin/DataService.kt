import java.util.Date

interface DataService {
    fun extractData(): JsonNode
    fun processData(): JsonNode
    fun saveData()
}