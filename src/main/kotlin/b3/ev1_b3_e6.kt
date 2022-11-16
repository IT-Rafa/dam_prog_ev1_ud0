package b3
/*
    Intro_B3_E6
    Imprime las tablas de multiplicar del 1 al 9. Utilizar for anidado.
    Ejemplo de impresión:
    Tabla de multiplicar del 1
    --------------------------
    1*1=1
    1*2=2
    1*3=3
    1*4=4
    ...
    Hasta 9
 */
fun main() {
    for(i in 1..9){
        println("Tabla de multiplicar del $i\n" +
                "--------------------------")
        for(j in 1..9){
            println("$i * $j = ${i*j}")
        }
        println()
    }
}