fun main() {
    /**
     * Function return if
     */
    fun syHello(name: String = ""): String {
        return if (name == "") {
            "Hello"
        } else {
            "Hello $name"
        }
    }
    println(syHello("Ranus"))


    /**
     * Function return when
     */

    fun hi(name: String = ""): String {
        return when (name) {
            "" -> "Hello"
            else -> "Hello $name"
        }

//        when (name) {
//            "" -> return "Hello"
//            else -> return "Hello $name"
//        }
    }
    println(hi("Radianus "))
}