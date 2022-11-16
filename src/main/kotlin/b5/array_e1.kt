package b5

/*
    Ejercicio 1:
    Observa el siguiente código
    fun main() {
        val nums = arrayOf(7, 10, 3, 34, 13)
        var min: Int
        var max: Int
        min = nums[0]
        max= nums[0]
        for (i in 1..4) {
            if (nums[i] < min) min = nums[i]
            if (nums[i] > max) max = nums[i]
        }
        println("El mínimo es: $min")
        println("El máximo es: $max")
    }
    Vuélvelo a escribir de forma que:
    1. Utilice while en lugar de for
    2. Utilice size para controlar el final del array
 */
fun main() {
    val nums = arrayOf(7, 10, 3, 34, 13)
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
