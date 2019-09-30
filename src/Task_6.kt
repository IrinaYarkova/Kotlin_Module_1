fun main(args: Array<String>){

    println("Enter number 1")
    var number1: String? = readLine()
    println("Enter number 2")
    var number2: String? = readLine()

    var res = number1!!.toDouble() > number2!!.toDouble()
    println(res)

}

