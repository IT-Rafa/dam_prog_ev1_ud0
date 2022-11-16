package b1
/*
    Intro_B1_E1:
    Escribe un programa que guarde en una variable entera la longitud del lado de un
    cuadrado, con dicha variable calcula el área del cuadrado y almacena este valor
    en otra variable.

    Imprime por pantalla el valor de esta última variable. Piensa al hacer este sencillo
    ejercicio en nombres apropiados para las variables utilizadas y piensa también en si
    es mejor declarar el tipo o dejar que el compilador lo deduzca.

    Ejemplo de posible salida:
        Para un cuadrado de lado 4 su área es 16
 */

fun main() {
    print("Indica la longitud del lado del cuadrado: ")
    val sideLong:Int = readln().toInt()

    val area = sideLong * sideLong

    println("Para un cuadrado de lado $sideLong su area es $area")
}