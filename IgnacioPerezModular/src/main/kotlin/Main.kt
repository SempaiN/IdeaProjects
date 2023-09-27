


/**
 * Descripción: Programa que hará de calculadora
 *
 * @author Ignacio Pérz Vesperoni
 * @version 1.4
 */
fun main(args: Array<String>) {
    println("Dame un nombre")
    var nameCheck = Regex(
        "^[A-Z][a-zA-Z]*\$"
    )
    var name = readln().toString()
    println(exponent(4,5))
    greeting(name)
    do {
        var option = readln().toDouble()
        when (option) {
            //1 ->
            //2 ->
            //3 ->
            else -> break
        }
    } while (true)
}

fun greeting(name: String) = println("Hola $name")

fun sum(number1: Int, number2: Int): Int {
    return number2 + number1
}

fun subtract(number1: Int, number2: Int): Int {
    return number1 - number2
}

fun multiply(number1: Int, number2: Int): Int {
    return number1 * number2
}

fun divide(number1: Int, number2: Int): Any{
     return number1/number2
}

fun exponent(number1:Int ,number2: Int): Int {
    var final = number1
    for (i in 0..<number2){
        final*=number2
    }
    return  final
}



