package b2
/*
    Intro_B2_E6
    Escribe un programa que a partir de un número de mes almacenado en una
    variable indique el nombre del mes correspondiente.
    Salida
    7
    El mes 7 se llama julio
 */
fun main() {
    // print("Introduce nº del mes: ")
    val nMouth = readln().toInt()
    val nameMouth:String

    if(nMouth == 1){
        nameMouth = "enero"
    }else if(nMouth == 2){
        nameMouth = "febrero"
    }else if(nMouth == 3){
        nameMouth = "marzo"
    }else if(nMouth == 4){
        nameMouth = "abril"
    }else if(nMouth == 5){
        nameMouth = "mayo"
    }else if(nMouth == 6){
        nameMouth = "junio"
    }else if(nMouth == 7){
        nameMouth = "julio"
    }else if(nMouth == 8){
        nameMouth = "agosto"
    }else if(nMouth == 9){
        nameMouth = "septiembre"
    }else if(nMouth == 10){
        nameMouth = "octubre"
    }else if(nMouth == 11){
        nameMouth = "noviembre"
    }else if(nMouth == 12){
        nameMouth = "diciembre"
    }else{
        nameMouth ="desconocido"
    }
    println("El mes $nMouth se llama $nameMouth")
}