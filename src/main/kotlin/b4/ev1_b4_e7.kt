package b4

/*
    Intro_B4_E7
    Escribe una función imprimirTabla() que imprime la tabla de multiplicar del
    primer argumento. La tabla acaba donde indica el segundo argumento.
    Ejemplo de funcionamiento
    fun main() {
        imprimirTabla(3,4)
        imprimirTabla(6,5)
    }
    Salida:
    Tabla de multiplicar del 3 hasta el 4
    =====================================
    3*1=3
    3*2=6
    3*3=9
    3*4=12

    Tabla de multiplicar del 6 hasta el 5
    =====================================
    6*1=6
    6*2=12
    6*3=18
    6*4=24
    6*5=30
 */
fun main() {
    imprimirTabla(3, 4)
    imprimirTabla(6, 5)
}

fun imprimirTabla(tabla: Int, veces: Int) {

    println("Tabla de multiplicar del $tabla hasta el $veces")
    println("=====================================")

    for (i in 1..veces) {
        println("$tabla * $i = ${tabla * i}")
    }
    println()
}