package b5
/*
    Ejercicio 5:
    Escribe la función sumar2 para que el siguiente main() produzca la
    salida indicada
    fun main() {
        val unArray = arrayOf(7, 10, 3, 34, 13)
        sumar2(unArray)
        for (num in unArray) print("$num ")
    }

    Salida:
    9 12 5 36 15
 */
fun main() {
    val unArray = arrayOf(7, 10, 3, 34, 13)
    sumar2(unArray)
    for (num in unArray) print("$num ")
}

fun sumar2(unArray: Array<Int>) {
    for(i in unArray.indices){
        unArray[i] +=2
    }
}

