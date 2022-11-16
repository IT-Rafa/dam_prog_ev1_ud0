package b5
/*
    Ejercicio 3:
    Crea un array llamado notas que contenga los siguientes valores:
    8.5,7.0,6.0 y 9.2. A continuación calcula e imprime la media de esos valores
 */
fun main(){
    val notas = arrayOf(8.5, 7.0, 6.0, 9.2)
    var suma = 0.0
    for(i in 0.. notas.lastIndex){
        suma += notas[i]
    }
    println("La media es: ${suma/notas.size}")
}