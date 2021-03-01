//Function loop biasa
fun fuctorialLoop(value: Int): Int {
    var result = 1
    for (i in value downTo 1) {
        result *= i
    }
    return result
}

/**
 * Fun fuctorial recursive
 * Function yang memanggil dirinya sendiri
 *
 */
fun factorialRecursive(value: Int): Int {
    return when (value) {
        1 -> 1
        else -> value * factorialRecursive(value - 1)
    }
}


fun main() {
    println(fuctorialLoop(10))
    println(factorialRecursive(10))
}