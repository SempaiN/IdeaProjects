import kotlin.concurrent.timerTask

/**
 * Descripción: Programa que pide números hasta que es introduzca un 0
 *              Antes de acaba rmuestra el mayor número, el menor y la media
 *
 * @author Nacho Pérez Vesperoni
 * @version 1.3
 *
 */
fun main(args: Array<String>) {
    var cont = 0
    var min: Int? = null
    var max: Int? = null
    var amount = 0
    println("Introduce un número,parará el programa cuando se introduzca un 0")
    var number = readln().toInt()
    do {//Do-While para pedir los números
        println("Introduce otro número")
        number = readln().toInt()
        if ((max == null || number > max)&&number!=0) max = number
        if ((min == null || number < min)&&number!=0) min = number
        amount += number
        cont++
    } while (number != 0)
    println("El número mayor es $max")
    println("El número menor es $min")
    println("La media es ${amount / cont}") //Divido la suma total con el contador
}