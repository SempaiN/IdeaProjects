/**
 * @author Ignacio Pérez Vesperoni
 * @version 1.3
 */


fun main(args: Array<String>) {
    //Pido primero todos los datos del usuario
    println("Introduce tu nombre completo")
    val name = readln()
    val nameCheck = Regex(
        "^[A-Za-z-']{3,50}"
    )
    println("Introduce tu email")
    val email = readln()
    val emailCheck = Regex(
        "^[a-zA-Z_.]+@[a-z]+.[a-z]{3}$"
    )
    println(
        """Introduce tu nif,si tienes NIE la equivalencia es
        |X = 0
        |Y = 1
        |Z = 2
        """.trimMargin()
    )
    val nif = readln()
    val nifCheck = Regex(
        "[012]?+[0-9]+[A-Za-z]$"
    )
    println("Introduce tu edad")
    val age = readln()
    val ageCheck = Regex(
        "^\\d[0-9]{0,3}$"
    )
    println("Introduce tu número de teléfono")
    val number = readln()
    val numberCheck = Regex(
        "[679]+[0-9]{8}$"
    )
    //Cuando acabo de pedirlos, los compruebo y digo si el dato es correcto o incorrecto
    if (name.contains(nameCheck)) println("\nNombre correcto") else println("\nEse nombre es incorrecto")
    if (email.contains(emailCheck)) println("Email correcto") else println("Formato de email incorrecto")
    if (nif.contains(nifCheck)) println("NIF correcto") else println("NIF incorrecto")
    if (age.contains(ageCheck) && age.toInt() < 150) println("Edad Correcta") else println("Edad incorrecta")
    if (number.contains(numberCheck)) println("Número de teléfono correcto") else println("Número de teléfono incorrecto")

}