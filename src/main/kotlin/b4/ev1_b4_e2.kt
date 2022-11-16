package b4
/*
    Intro_B4_E2
    Ahora la función pensar() debe incorporar un parámetro
    fun main() {
        pensar("La vida es dura")
        pensar("la cerveza se parece bastante al pis")
        pensar("prefiero ser millonario que guapo")
    }
    salida:
    Pienso que La vida es dura
    Pienso que la cerveza se parece bastante al pis
    Pienso que prefiero ser millonario que guapo
 */
fun main(){
    pensar("La vida es dura")
    pensar("la cerveza se parece bastante al pis")
    pensar("prefiero ser millonario que guapo")
}
fun pensar(st: String){
    println("Pienso que $st")
}