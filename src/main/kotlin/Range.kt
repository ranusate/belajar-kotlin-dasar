fun main(){
//    Operation range
    var a = 1..1000
    var b = 1000 downTo 0 step 100
    println(a.count())
    println(a.contains(10))
    println(a.first())
    println(a.last())
    println(a.step)
    println(b.step)
}