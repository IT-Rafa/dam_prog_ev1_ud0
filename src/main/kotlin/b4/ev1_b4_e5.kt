package b4
/*
    Intro_B4_E5
    Escribe una función repartir()
    fun main() {
        print("Tengo 20 caramelos y 3 amigos, a cada uno le tocan: " +
         repartir(20,3) +" caramelos")
    }
    Salida:
    Tengo 20 caramelos y 3 amigos, a cada uno le tocan: 6 caramelos
 */
fun main(){
    print("Tengo 20 caramelos y 3 amigos, a cada uno le tocan: " +
            repartir(20,3) +" caramelos")
}

fun repartir(caramelos:Int, amigos:Int) = caramelos/amigos
