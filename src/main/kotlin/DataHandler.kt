import java.sql.Date

interface DataHandler {
    fun readData(dateFrom: Date, dateTo: Date)
    fun saveData(json: JsonNode)
}