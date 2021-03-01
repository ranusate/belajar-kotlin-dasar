fun main() {
    val name = arrayOf("Ranus", "Raba", "Ate")
    for (names in name) {
        println(names)
    }

    for (i in 0..190 step 2) {
        print(i)
    }

    var ukuraArray = name.size -1
    for (i in 0..ukuraArray) {
        println("Index ke ${i} Name ${name.get(i)}")
    }
}