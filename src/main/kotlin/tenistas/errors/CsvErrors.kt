package tenistas.errors

sealed class CsvErrors(mesage: String){
    class InvalidCsvFormat(mesage: String) : CsvErrors(mesage)
    class InvalidTenistaFormat(mesage: String) : CsvErrors(mesage)

}