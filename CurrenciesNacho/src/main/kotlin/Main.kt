fun main(args: Array<String>) {
    //Pido la cantidad
    println("Introduce una cantidad en euros y te mostraré sus equivalencias")
    val euros = readln().toInt()
    //Ahora muestro las equivalencias utilizando string templates
    println(
        """ |$euros€ equivale a ${euros * 1.07}$ 
            |$euros€ equivale a ${euros * 0.86}£
            |$euros€ equivale a ${euros * 157.49}¥""".trimMargin()
    )

}