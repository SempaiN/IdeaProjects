/**
 * Descripción: Programa que pida 10 números al usuario y finalmente muestre cuántos son mayores que cero.
 *
 * @author Ignacio Pérez Vesperoni
 * @version 1.4
 *
 */
fun main(args: Array<String>) {
    var number: Int
    var cont = 0
    for (i in 1..10) {//For para pedir los 10 números
        println("Introduce un número, cuando acabe mostraré cuantos son mayores de 0")
        number = readln().toInt()
        if (number > 0) cont++// Si el número es mayor que 0 se suma uno al contador
    }
    println("Hay $cont numeros mayores que 0")

}