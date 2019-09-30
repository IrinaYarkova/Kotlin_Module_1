fun main(args: Array<String>) {

    val a: Int? = null // если создать переменную типа Any?, то разделить ее на 2,5 невозможно
    var b = a ?: 20

    var c = b / 2.5 // тип переменной float

    println(c)
}