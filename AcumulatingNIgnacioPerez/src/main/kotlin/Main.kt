/**
 * @author Ignacio Pérez Vesperoni
 * @version 1.2
 */
fun main(args: Array<String>) {
    print(
        """Dime la cantidad de números que vas a introducir
           |Se hará una suma de todos los positivos
    """.trimMargin()
    )
    val times = readln().toInt()//Pido la cantidad de números que va a introducir
    var amount: Double = 0.0
    for (i in 1..times) {//Hago un for con $times vueltas
        println("Escribe un número")
        var number = readln().toDouble()
        if (number > 0) amount += number //Pido números para la suma total,si son positivos se suman
    }
    println("La suma total es $amount")
}