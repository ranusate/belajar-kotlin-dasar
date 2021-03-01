import kotlin.reflect.typeOf

/**
 * gak wajib menggunakan tanda titik
 * melakukan operasi matematika dari 2 data
 * syarat haru sebagai fun dari member
 * harus memiliki 1 parameter
 * param tidak bole h dari  dan tidak boleh memiliki nilai default
 */

infix fun String.to(type: String): String {
    return if (type == "UP") {
        this.toUpperCase()
    } else {
        this.toLowerCase()
    }
}


fun main() {
    val result = "Ranus Ate" to "UP"
    println(result)
}