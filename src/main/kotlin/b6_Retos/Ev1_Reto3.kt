package b6_Retos
/*
    Ejercicio 3: El día de navidad

    Entrada
    La entrada comenzará con un número N indicando cuántas fechas se consultarán.
    A continuación vendrán esas N fechas, con dos números enteros, día y mes en
    el formato DD MM indicando el día y el mes a consultar.
    Todas las fechas serán correctas.

    Salida
    Por cada fecha de la entrada, el programa deberá escribir Si la fecha es la del
    día de Navidad, 25 de diciembre, y NO en otro caso.

    Entrada de ejemplo
    2
    25 12
    03 05

    Salida de ejemplo
    SI
    NO
 */

fun main() {
    //print("Introduzca fechas: (día + mes): ")
    val totFechas = readln().toInt()

    val dias = IntArray(totFechas)
    val meses = IntArray(totFechas)

    for (i in 0 until totFechas) {
        val fecha = readln().split(" ")
        dias[i] = fecha[0].toInt()
        meses[i] = fecha[1].toInt()
    }

    for (i in 0 until totFechas) {
        if (dias[i] == 25 && meses[i] == 12) {
            println("SÍ")
        } else {
            println("NO")
        }
    }

}