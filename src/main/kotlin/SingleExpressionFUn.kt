/**
 * Single expression function
 * Function yang ditulis dalam 1 baris
 */
fun double(a: Int): Int = a * 2
fun hi(name: String): Unit = println("Ji $name")

fun main() {
    println(double(21))
    println(hi("Radianus"))
}