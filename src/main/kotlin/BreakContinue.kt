@file:Suppress("NAME_SHADOWING")
// Break digunakan untuk menghentikan perulangan
//continue digunakan perulangan yang lagi berjalan dan akan melanjutkan perulangan selanjutnya
//Break bisa digunakan untuk semua perulangan

fun main() {
    var i = 0

    while (true) {
        println("Perulangan ke $i")
        i++
        if (i > 100) {
            break
        }
    }


    for (i in 0..100) {
        if (i % 2 == 0) {
            continue
        }
        println("Print $i")
    }
}