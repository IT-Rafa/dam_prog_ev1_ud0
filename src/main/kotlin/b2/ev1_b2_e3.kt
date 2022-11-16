package b2
/*
    Intro_B2_E3
    Diseña un programa que pida dos números enteros por teclado, determine si el
    primero es múltiplo del segundo y muestre el resultado de la siguiente forma:

    - <num1> es múltiplo de <num2>, en caso de que sea múltiplo
    - <num1> no es múltiplo de <num2>, en caso de que no lo sea

    Ejemplo:
    17
    8
    17 NO es múltiplo de 8
 */
fun main() {
    // print("Introduce entero para probar si es múltiplo del siguiente: ")
    val multi = readln().toInt()
    // print("Introduce entero: ")
    val num = readln().toInt()

    if (num % multi == 0){
        println("$multi es múltiplo de $num")
    }else{
        println("$multi NO es múltiplo de $num")
    }
}