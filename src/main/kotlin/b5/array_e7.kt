package b5

/*
    Ejercicio 7:
    Introducimos líneas compuestas por números enteros separados por espacios en
    blanco y nuestro programa suma estos números e imprime el resultado por
    pantalla. Cuando una línea contiene so lo el número 0, el programa acaba.
    Utilizar la función split() de String para conseguir resolver el problema.
    Ejemplo de salida:
    1 2 3
    6
    0 1 2 3
    6
    99 1 2
    102
    2 2 0 0
    4
    2 0 2
    4
    0
 */
fun main() {
    print("Introduce números: ")
    var linea = readln()
    while (linea != "0") {
        val lista = linea.split(' ')
        var suma = 0
        for (numero in lista) {
            suma += numero.toInt()
        }
        println(suma)
        linea = readln()
    }
}