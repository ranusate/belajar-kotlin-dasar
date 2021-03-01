fun main() {
    val nilai: String = "V"
    when (nilai) {
        "A" -> println("Good")
        "B" -> println("Bad")
        "C" -> {
            println("Not Bad")
        }
        else -> println("Try again")
    }

    when (nilai) {
        "A", "B", "C" -> {
            println("Selamat anda lulus")
        }
        else -> {
            println("Anda tidak lulus")
        }
    }

//    WHEN IN
    val nilaiLulus: Array<String> = arrayOf("A", "B", "C")
    when (nilai) {
        in nilaiLulus -> println("Lulus")
        !in nilaiLulus -> println("Tidak lulus")
    }

//    when is
//     digunakan untuk mengecek type data
    var name = "Ranus"
    when (name) {
        is String -> println("Name is string")
        !is String -> println("Name not string")
        else -> print("errr")
    }

    val nilais = 90
    when {
        nilais >= 90 -> println("Anda lulus")
        else -> println("Anda tidak lulus")
    }
}