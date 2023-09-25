fun main(args: Array<String>) {
    //Primero pido los 4 números para hacer las operaciones
    println("Dame el primer número")
    val value1 = readln().toDouble()
    println("Dame el segundo número")
    val value2 = readln().toDouble()
    println("Dame el tercer número")
    val value3 = readln().toDouble()
    println("Dame el cuarto número")
    val value4 = readln().toDouble()
    //Hago todas las operaciones y guardo cada una en una variable
    val operation1 = value1 + value2 + value3 + value4
    val operation2 = (value1 * value2 + value3 * value4) / operation1
    val operation3 = value1 * value1 + value2 * value2 - value3 / value4
    val operation4 = value1 > value2
    val operation5 = value1 - value2 <= value3 - value4
    val operation6 = (value1 > value2 || value3 < value4)
    val operation7 = (value1 < value2 && (value3 < value4 || value1 + value2 > value3 - value4))
    val operation8 = value1 + value4 < value2 * (value3 - value1)
    //Ahora muesto el resultado de todas las operaciones hechas
    println(
        """ |Operación 1: $value1+$value2+$value3+$value4 = $operation1 
            |Operación 2: ($value1*$value2+$value3*$value4)/($value1+$value2+$value3+$value4) = $operation2
            |Operación 3: $value1*$value1+$value2*$value2-$value3/$value4 = $operation3
            |Operación 4: $value1>$value2 = $operation4
            |Operación 5: $value1-$value2 <= $value3-$value4 = $operation5
            |Operación 6: $value1>$value2 o $value3<$value4 = $operation6
            |Operación 7: $value1<$value2 y $value3<$value4 o $value1+$value2>$value3-$value4 = $operation7
            |Operación 8: $value1+$value4<$value2*($value3-$value1) = $operation8""".trimMargin()
    )

}