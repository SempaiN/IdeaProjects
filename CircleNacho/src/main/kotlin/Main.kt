/**
 * @author Ignacio Pérez Vesperoni
 * @version 4.0
 */
fun main(args: Array<String>) {
    //Pido el radio del circulo
    println("Dame el radio del circulo")
    val radius = readln().toDouble()
    //Guardo todas las operaciones en variables
    val area = 3.1415 * (radius * radius)
    val surface = 2 * 3.1415 * radius
    val volume = (4.0 / 3.0) * 3.1415 * (radius * radius * radius)
    //Muestro todo en un único println
    println(
        """El area del circulo es $area
        |El perimetro del cirulo es $surface
        |El volumen de la esfera es $volume
    """.trimMargin()
    )

}