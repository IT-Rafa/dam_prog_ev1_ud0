package b2
/*
    Intro_B2_E1
    Determinar si el valor de una variable x es par o impar. Un número es par si es
    divisible entre 2, es decir, si al dividirlo entre dos obtenemos de resto 0.
    Ejemplo de funcionamiento:
        teclea un entero: 4
        4 es par
 */

fun main() {
    print("Teclea un entero: ")
    val integer = readln().toInt()

    if (integer % 2 == 0){
        println("$integer es par")
    }else{
        println("$integer no es par")
    }
}