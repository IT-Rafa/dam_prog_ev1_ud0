package b5
/*
    Ejercicio 6
    Repite el ejercicio anterior de forma que en lugar de arrays se
    trabaje con listas. Usa listas tanto en el main como en la función sumar2()

    * Cambio nombre función sumar por estar en mismo package
 */
fun main() {
    val unList = mutableListOf(7, 10, 3, 34, 13)
    sumar2List(unList)
    for (num in unList) print("$num ")
}

fun sumar2List(unArray: MutableList<Int>) {
    for(i in unArray.indices){
        unArray[i] +=2
    }
}
