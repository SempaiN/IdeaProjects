/**
 * @author Ignacio Pérez Vesperoni
 * @version 4.0
 */
fun main(args: Array<String>) {
    println("Dame el radio del circulo")
    val radius = readln().toDouble()
    val area = 3.1415 * (radius * radius)
    val surface = 4 * 3.1415 * (radius * radius)
    val volume = (4.0 / 3.0) * 3.1415 * (radius * radius * radius)
    println(
        """El area del circulo es $area
        |El perimetro del cirulo es $surface
        |El volumen de la esfera es $volume
    """.trimMargin()
    )

}