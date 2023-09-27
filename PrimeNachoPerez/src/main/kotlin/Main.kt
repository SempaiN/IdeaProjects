/**
 * @author Ignacio Pérez Pose
 * @version 1.1
 */
fun main(args: Array<String>) {
    do {
        print("Introduce un número y te diré si es primo o no\n")
        var number = readln().toInt()//Leo el número obligando al usuario a introducir un int
        var prime = 0 //Uso un contador para saber si es primo
        for (i in 2..number) {
            if (number % i == 0) prime++
        }
        //Si el resto de la división da 0 se añade un uno al contador
        if (prime == 2) println("Es primo") else println("No es primo")
        //Si hay más de 2 numeros divisibles no es primo
        println("¿Quieres seguir introduciendo números?")
        var answer: String = readln().lowercase()//Pregunto si quiere seguir comprobando números
    } while (answer == "si")
}