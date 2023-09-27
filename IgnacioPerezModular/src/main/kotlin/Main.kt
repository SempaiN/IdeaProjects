/**
 * Descripción: Programa que hará de calculadora
 *
 * @author Ignacio Pérz Vesperoni
 * @version 1.4
 */
fun main(args: Array<String>) {
    var nameCheck = Regex(
        "^[A-Z][a-zA-Z]*\$"
    )
    var optionCheck = Regex(
        "^[0-5]$"
    )

    println("¿Cómo te llamas")
    var name = readln().toString()

    while (name.contains(nameCheck)) {
        greeting(name)
        println(
            """¿Qué quieres hacer?
            |1.- Sumar
            |2.- Restar
            |3.- Multiplicar
            |4.- Dividir
            |5.- Potencia
            |0.- Salir
        """.trimMargin()
        )

        var option = readln().toString()
        if (option.toInt() == 0) break
        if (!option.contains(optionCheck)) {
            println("Opción no válida")
            break
        }
        println("Dame el primer número")
        var number1 = readln().toInt()
        println("Dame el segundo número")
        var number2 = readln().toInt()

        when (option.toInt()) {
            1 -> println("$number1 + $number2 = ${sum(number1, number2)}")
            2 -> println("$number1 - $number2 = ${subtract(number1, number2)}")
            3 -> println("$number1 * $number2 = ${multiply(number1, number2)}")
            4 -> println("$number1 / $number2 = ${divide(number1, number2)}")
            5 -> println("$number1^$number2 = ${exponent(number1, number2)} ")
        }
    }
    if (!name.contains(nameCheck)) println("Ese nombre no es válido")
}

fun greeting(name: String) = println("Hola $name\n")

fun sum(number1: Int, number2: Int): Int {
    return number2 + number1
}

fun subtract(number1: Int, number2: Int): Int {
    return number1 - number2
}

fun multiply(number1: Int, number2: Int): Int {
    return number1 * number2
}

fun divide(number1: Int, number2: Int): Any {
    if (number2 == 0) return "No se puede divir entre 0"
    else return number1 / number2
}

fun exponent(number1: Int, number2: Int): Int {
    var final = number1
    for (i in 1..<number2) {
        final *= number1
    }
    return final
}



