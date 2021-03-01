/**
 * Function tanpa parameter
 */
fun helloWorld() {
    println("Hello World")
}

/**
 * Function parameter
 * wajib diisi
 */
fun tambah(a: Int, b: Int) {
    println(a + b)
}

/**
 * Function default kotlin
 * Memasukan nilai default pada parameter
 */

fun hello(firstName: String, LastName: String = "") {
    println("Hello $firstName $LastName")
}

/**
 * Function named argument
 */
fun myName(firstName: String? = null, middleName: String? = null, lastName: String) {
    if (firstName == null) {
        println(lastName)
    }
    println("my name $firstName $middleName $lastName, ")
}

/**
 * Unit returning function
 * type data unit adalah tanda bahwa function tidak mengembalikan nilai atau biasa dikenal denan void
 */

fun unitType(name: String? = null) {
    println("Hello $name")
}

/**
 * Function return data atau type
 * klaua functionmengembalikandata int maka type wajib menyebutkan type data pengembalian
 * juga wajib di dalam function haru balikin datanya
 */

fun sum(a: Int, b: Int): Int {
    return a + b
}


/**
 * function main
 */
fun main() {
    helloWorld()
    tambah(10, 2)
    hello("Ranus", "Ate")
    hello("Ranus")
    myName("Ranus", middleName = "Ate", lastName = "Raba")
    unitType("Radianus Raba Ate")
    val result = sum(12, 12)
    print(result)
}
