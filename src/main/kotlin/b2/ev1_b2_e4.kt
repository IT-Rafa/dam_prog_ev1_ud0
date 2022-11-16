package b2

/*
    Intro_B2_E4
    Haz un programa que acepte 3 números enteros introducidos por el usuario y:
    - muestre el mensaje “3 iguales” si los tres números son iguales
    - muestre el menor de los 3 en caso de que no sean iguales

    Ejemplos:
    3
    3
    3
    los tres son iguales

    8
    3
    5
    El menor: 3
 */
fun main() {
    val numbs = IntArray(3)
    for (i in 0..2) {
        print("Introduce nº: ")
        numbs[i] = readln().toInt()
    }

    if (numbs[0] == numbs[1] && numbs[0] == numbs[2]) {
        println("los tres son iguales")

    } else {
        var min = numbs[0]

        if (numbs[1] < min) {
            min = numbs[1]
        }
        if(numbs[2] < min){
            min = numbs[2]
        }
        println("El menor es: $min")

    }
}