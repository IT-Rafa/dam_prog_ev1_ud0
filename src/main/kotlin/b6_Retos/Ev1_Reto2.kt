package b6_Retos
/*
    Ejercicio 2: ¿Qué lado de la calle?
    Entrada
    El programa recibirá, por la entrada estándar, un conjunto de casos de prueba,
    cada uno en una línea. Cada caso de prueba estará compuesto de un número de viviendas.
    Se garantiza que nunca será mayor que 1.000.
    El último caso, que no deberá procesarse, será el número 0.

    Salida
    Para cada caso de prueba el programa escribirá "IZQUIERDA" (sin las comillas) si la vivienda
    está situada a la izquierda de la calle, y "DERECHA" si está a la derecha.

    Entrada de ejemplo
    3
    10
    41
    0

    Salida de ejemplo
    IZQUIERDA
    DERECHA
    IZQUIERDA
 */
fun main() {

    val numViviendas: MutableList<Int> = mutableListOf()
    println("Introduce los números (0 para finalizar): ")
    var n:Int
    do{
        n =  readln().toInt()
        numViviendas.add(n)
    } while(n != 0)
    numViviendas.remove(n)

    for (num in numViviendas){
        if(num % 2 == 0){
            println("DERECHA")
        }else{
            println("IZQUIERDA")
        }
    }

}

