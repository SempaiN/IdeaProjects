/***
 * Descripción: Programa que pida números al usuario y los almacene en una colección
 * el programa dirá cuántos números hay de una cifra, cuántos hay de dos, cuántos hay de más de dos cifras y cuántos son pares.
 * Cundo se introduce fin el programa preguntará si se quieren introducir más números o quiere acabar el prograna
 * Si se quieren introducir más preguntará si se quieren continuar con los anteriores o con nuevos
 *
 * @author Ignacio Pérez Vesperoni
 * @version 1.4
 *
 */

fun main(args: Array<String>) {
    var list: MutableList<Int> = mutableListOf()
    var number: Any
    var response: String
    var clear: String
    do {
        println("Introduce un número")
        number = readln().lowercase()
        if (number == "fin") {
            println("¿Quieres introducir más números?")
            response = readln().lowercase()
            if (response == "si") {
                println("Quieres seguir con los mismos números")
                clear = readln().lowercase()
                if (clear == "no") list.clear()
                continue
            } else break
        }else list.add(number.toInt())
    } while (true)
    list.forEach {
        println(it)
    }

}

fun getNumber(): Int {
    var number: String
    do {
        number = readln()
        if (!number.matches(Regex("^-?\\d+$"))) println("Número no válido")
    } while (!number.matches(Regex("^-?\\d+$")))
    return number.toInt()
}


fun countOneDigit(list: MutableList<Int>): Int {
    var cont = 0
    for (i in list.indices) {
        if (list[i] in (-9..9)) cont++
    }
    return cont
}

fun countTwoDigit(list: MutableList<Int>): Int {
    var cont = 0
    for (i in list.indices) {
        if (list[i] in (10..99) || list[i] in (-10 downTo -99)) cont++
    }
    return cont
}

fun countMoreDigit(list: MutableList<Int>): Int {
    var cont = 0
    for (i in list.indices) if (list[i] > 99 || list[i] < -99) cont++
    return cont
}

fun isEven(list: MutableList<Int>): Int {
    var cont = 0
    for (i in list.indices) if (list[i] % 2 == 0) cont++
    return cont
}

fun info(list: MutableList<Int>): Int{
    println("""En la colección hay
        |${countOneDigit(list)} números de una cifra
    """.trimMargin())
}