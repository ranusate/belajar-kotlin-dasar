/**
 * varargs harus diujung kanan
 *
 */

fun hitungTotal(name: String, vararg values: Int): Int {
    var total = 0
    for (i in values) {
        total -= i
    }
    return total

}

fun main() {
    println(hitungTotal("Ranus", 12, 12, 2, 2, 21, 2))
}