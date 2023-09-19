fun main(args: Array<String>) {
    println("Dame el primer número")
    val value1 = readln().toDouble()
    println("Dame el segundo número")
    val value2 = readln().toDouble()
    println("Dame el tercer número")
    val value3 = readln().toDouble()
    println("Dame el tercer número")
    val value4 = readln().toDouble()

    val operation1 = value1 + value2 + value3 + value4
    val operation2 = (value1 * value2 + value3 * value4) / operation1
    val operation3 = value1 * value1 + value2 * value2 - value3 / value4
    val operation4 = value1 > value2
    val operation5 = value1 - value2 <= value3 - value4
    val operation6 = (value1 > value2 || value3 < value4)
    val operation7 = (value1 < value2 && (value3 < value4 || value1 + value2 > value3 - value4))
    val operation8 = value1+value4<value2*(value3-value1)


    println(operation6)
}