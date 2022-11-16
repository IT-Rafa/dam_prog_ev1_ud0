package b3
/*
    Intro_B3_E4
    Imprime la progresión 1 2 4 8 16 32 ....1024. Observa que en cada paso
    doblamos el valor anterior.
 */
fun main() {
    var i =1
    while(i <= 1024){
        print("$i ")
        i*=2
    }
}