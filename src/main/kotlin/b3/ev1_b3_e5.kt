package b3

/*
    Intro_B3_E5
    Escribe el siguiente código con while
    fun main(){
    for(i in 1..3)
        for(j in 1..3)
            println("$i$j")
    }
 */
fun main() {
    var i = 0
    while (++i <= 3) {
        var j = 0
        while (++j <= 3) {
            println("$i$j")
        }
    }
}