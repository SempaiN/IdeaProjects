fun main(args: Array<String>) {
    println("Introduce una cantidad en euros y te mostraré sus equivalencias")
    val euros = readln().toInt()
    println(
        """ |$euros€ equivale a ${euros * 1.07}$ 
            |$euros€ equivale a ${euros * 0.86}£
            |$euros€ equivale a ${euros * 157.49}¥""".trimMargin()
    )

}