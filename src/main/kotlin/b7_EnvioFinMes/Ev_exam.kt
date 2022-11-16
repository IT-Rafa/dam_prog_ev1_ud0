/*
    Ejercicio a enviar de EV1
    Fin de mes
    A mí no me asusta el fin del mundo; me asusta el fin de mes, porque no siempre consigo
    que mis ingresos lleguen conmigo. Los gastos se acumulan, y no sé qué más hacer para
    estirar mi triste sueldo.

    Creo que el primer paso para mejorar mi situación es hacer una estimación de lo bien o
    lo mal que me va a ir un mes, en función de los ingresos y los gastos previstos.
    Sé cuánto dinero tengo en el banco al principio, y sé cuánto va a variar.
    ¿Me ayudas a saber si llegaré a fin de mes con dinero en el banco?

    Entrada
    La entrada comienza con un número que indica cuántos casos de prueba vendrán a continuación.
    Cada caso contiene dos números, −10.000 ≤ s,c ≤ 10.000 indicando, respectivamente, el saldo
    en mi cuenta bancaria el primer día del mes, y el cambio estimado (ingresos menos gastos)
    durante el mes.

    Salida
    Para cada caso de prueba, se escribirá "SI" si llego a fin de mes con saldo mayor o igual que
    cero, y "NO" en otro caso.

    Entrada de ejemplo
        4
        100 -10
        -10 -100
        -10 100
        100 -1000

    Salida de ejemplo
        SI
        NO
        SI
        NO
 */
fun main() {
// print("Introduce casos a probar: ")
    val casos = readln().toInt()
    val primerDia =
        IntArray(casos)
    val cambio = IntArray(casos)
    for(i in 0 until casos){
// print("Introduce \"Saldo primer día mes\" y el \"cambio estimado\": ")
        val input = readln().split(" ")
        primerDia[i] = input[0].toInt()
        cambio[i] = input[1].toInt()
    }
    for(i in 0 until casos){
        if(primerDia[i] + cambio[i] < 0){
            println("NO")
        }else{
            println("SÍ")
        }
    }
}