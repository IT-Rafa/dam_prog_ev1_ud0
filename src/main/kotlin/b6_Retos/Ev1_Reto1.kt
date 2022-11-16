package b6_Retos
/*
    Ejercicio 1: ¡Hola mundo!
    Escribir un programa que escriba tantos "hola mundo" como nos pidan.

    Entrada:
    La entrada consta de una única línea que contiene un número n, 0 ≤ n ≤ 5,
    que indica cuántos mensajes hay que emitir.

    Salida
    Cada mensaje a escribir aparecerá en una única línea y será la cadena "Hola mundo.".

    Entrada de ejemplo
    3

   Salida de ejemplo
    Hola mundo.
    Hola mundo.
    Hola mundo.


 */
fun main() {
    print("Introduce cantidad líneas: ")
    val cant = readln().toInt()

    for(i in 1..cant){
        println("Hola mundo.")
    }
}