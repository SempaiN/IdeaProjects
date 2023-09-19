/**
 * @author Ignacio Pérez Vesperoni
 * @version 1.3
 */

/*
   - nombre completo: solo letras, guiones (-) y apóstrofe (') entre 3 y 50 caracteres,
   - email: formato de dirección de correo electrónico.
   - dni: 7 u 8 números seguidos de una letra mayúscula.
   - edad: número de como máximo 3 cifras.
   - teléfono: número de 9 cifras que debe empezar por 9, 6 o 7.
 */
fun main(args: Array<String>) {
    println("Introduce tu nombre completo")
    val name = readln()
    val namecheck = Regex(
        "^[a-z]{3,50}(-|')"
    )
    val email = readln();
    val emailcheck = Regex(
        "^[a-z]\\W@"
    )
}