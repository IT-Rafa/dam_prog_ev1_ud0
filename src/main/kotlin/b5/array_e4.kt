package b5
/*
    Ejercicio 4:
    Repite el ejercicio anterior utilizando una lista
 */
fun main(){
    val notas = listOf(8.5, 7.0, 6.0, 9.2)
    var suma = 0.0
    for(i in 0.. notas.lastIndex){
        suma += notas[i]
    }
    println("La media es: ${suma/notas.size}")
}