package b4
/*
    Intro_B4_E4
    Ahora sumar no imprime nada y devuelve un valor entero
    fun main() {
        var primeraSuma=sumar(2,3)
        println("la primera suma es: $primeraSuma")
        println("y la segunda es ${sumar(4,5)}")
        println("otra suma que vale: "+ sumar(9,8))
    }
    Salida:
    la primera suma es: 5
    y la segunda es 9
    otra suma que vale: 17

    ** Cambie nombre función sumar por ser igual en otros ejercicios usando package b4
 */
fun main(){
    val primeraSuma=sumarE4(2,3)
    println("la primera suma es: $primeraSuma")
    println("y la segunda es ${sumarE4(4,5)}")
    println("otra suma que vale: "+ sumarE4(9,8))
}

fun sumarE4(int_1: Int, int_2: Int): Int{
    return int_1 + int_2
}