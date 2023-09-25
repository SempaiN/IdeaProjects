/**
 * @author Ignacio Pérez Pose
 * @version 1.1
 */
fun main(args: Array<String>) {
    do {
        print("Introduce un número y te diré si es primo o no\n")
        var number = readln().toInt()
        var prime = 0
        for (i in 1..number) {
            if (number % i == 0) prime++
        }
        if (prime == 2) println("Es primo") else println("No es primo")
        println("¿Quieres seguir introduciendo números?")
        var answer: String = readln().lowercase()
    } while (answer == "si")
}