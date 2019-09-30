fun main(args: Array<String>) {

    val a: Any? = null
    var b: Int = a as Int? ?: 20

    var c = b / 2.5 // тип переменной float

    println(c)
}