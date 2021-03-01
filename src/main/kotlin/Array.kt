fun main() {
//    tipe data array
//    array tipe data yang berisikan sekumpulan data
//    dikotlin hanya bisa nampung data string doang
//    contoh

    val members: Array<String> = arrayOf("Ranus", "Ate", "Raba")
    val age: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 6)
    println(members.size)
    println(members[1])
    println(members.get(2))
    print(age)
//  untuk mengubah array
    members.set(1, "Raba")
    println(members)
//    operai array
//    size untuk mendapatkan panjang array
}