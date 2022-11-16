package b6_Retos
/*
    Ejercicio 4: Perímetro de un rectángulo
    Entrada
    La entrada consta de una serie de casos de prueba.
    Cada uno contiene, en una sola línea, la definición de un rectángulo.
    Un rectángulo se especifica proporcionando las coordenadas de la esquina superior derecha.
    Se debe considerar que la esquina inferior izquierda está siempre en el origen
    de coordenadas, es decir en (0, 0).
    Se garantiza que la longitud de un lado no superará 108.

    Ejemplo de perímetro
    El último caso de prueba, que no debe procesarse, contendrá un valor negativo en alguno de
    los ejes.

    Salida
    Para cada caso de prueba se escribirá, en una línea independiente, el perímetro del rectángulo.

    Entrada de ejemplo
    3 2
    5 4
    -9 3

    Salida de ejemplo
    10
    18
 */
fun main() {
    var seguir = true
    val l1: MutableList<Int> = arrayListOf()
    val l2: MutableList<Int> = arrayListOf()

    while(seguir){
        val input = readln().split(" ")
        if(input[0].contains("-") || input[1].contains("-")){
            seguir = false
        }else{
            l1.add(input[0].toInt())
            l2.add(input[1].toInt())
        }
    }
    for(i in l1.indices){
        println((l1[i]*2) + (l2[i]*2))
    }
}