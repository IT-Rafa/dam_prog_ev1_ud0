package b4
/*
    Intro_B4_E8
    Escribe la función readlnToInt() que convierte una línea del teclado en un entero.
    Por supuesto se asume que la línea que se teclea contiene un entero correcto.
    Ejemplo de main con salida
    fun main() {
        print("entero 1 por favor: ")
        val i1=readlnToInt()
        print("entero 2 por favor: ")
        val i2=readlnToInt()
        var resultado=i1*i2
        println("$i1*$i2 es $resultado")
    }
 */
fun main(){
    print("entero 1 por favor: ")
    val i1=readlnToInt()
    print("entero 2 por favor: ")
    val i2=readlnToInt()
    val resultado=i1*i2
    println("$i1*$i2 es $resultado")
}

fun readlnToInt():Int = readln().toInt()