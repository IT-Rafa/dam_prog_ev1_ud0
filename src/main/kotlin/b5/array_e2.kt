package b5
/*
    Ejercicio 2:
    Escribe el código del ejercicio 1 utilizando una lista
 */
fun main(){
    val nums = listOf(7, 10, 3, 34, 13)
    var min: Int
    var max: Int
    min = nums[0]
    max = nums[0]
    var i = 1
    while(i < nums.size){
        if (nums[i] < min) min = nums[i]
        if (nums[i] > max) max = nums[i]
        i++
    }

    println("El mínimo es: $min")
    println("El máximo es: $max")
}