package b3
/*
    Intro_B3_E1
    Imprime los números del 0 al 10 ambos inclusive con for, while y do while
    Salida:
    Con for:      0 1 2 3 4 5 6 7 8 9 10
    Con while:    0 1 2 3 4 5 6 7 8 9 10
    Con do while: 0 1 2 3 4 5 6 7 8 9 10
 */
fun main() {
    print("Con for:      ")
    for(i in 0..10){
        print("$i ")
    }
    println()

    print("Con while:    ")
    var i = 0
    while(i <= 10){
        print("$i ")
        i++
    }
    println()

    print("Con do while: ")
    i = 0
    do{
        print("$i ")
    }while(i++ < 10)
    println()

}