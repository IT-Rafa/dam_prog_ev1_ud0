package b2
/*
    Intro_B2_E7
    Consigue el efecto contrario al ejercicio anterior
    Salida:
    Julio
    El mes julio es el número 7

    es suficiente que los soluciones con when
 */
fun main() {
    // print("Introduce nombre mes: ")
    val nameMouth = readln()

    val numMouth = when(nameMouth.uppercase()){
        "ENERO" -> 1
        "FEBRERO" -> 2
        "MARZO" -> 3
        "ABRIL" -> 4
        "MAYO" -> 5
        "JUNIO" -> 6
        "JULIO" -> 7
        "AGOSTO" -> 8
        "SEPTIEMBRE" -> 9
        "OCTUBRE" -> 10
        "NOVIEMBRE" -> 11
        "DICIEMBRE" -> 12

        else -> 0
    }
    println("El mes $nameMouth es el número $numMouth")
}