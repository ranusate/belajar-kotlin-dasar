fun test() {
//    error
//    hy("ranus")
}
fun main() {
    /**
     * Function scope
     * hanya bisa diakses dari fun main
     */
    fun hy(guest: String): Unit = println("Hi $guest ")
    hy("Ranus")
}


