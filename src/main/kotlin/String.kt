fun main() {
    var name: String = """Radianus Raba Ate"""
    var firstName = "Ranus"
    var lastName = "Ate"
    var address = """
        jl.belum ada
        desa juga belum ada
    """.trimMargin()
    println(name)
    print(firstName)
    println(lastName)
    println(address.trimMargin())

    println("========Concat string=====")
    var fullName = firstName +" "+lastName
    println(fullName)


    println("====================string template==========================")
    var nameFull = "My name : $firstName $lastName ${lastName.length}"
    print(nameFull)
}


