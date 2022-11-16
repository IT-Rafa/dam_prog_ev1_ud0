package b1
/*
    Intro_B1_E3:
    Calcula el IMC de una persona cuyo peso y altura los tenemos almacenados en
    sus respectivas variables dentro de nuestro programa. La fórmula que calcula el
    IMC es:
    IMC = peso(kg) / altura(elev a 2)(m)

    Si observas la salida ejemplo, el programa debe imprimir dos cosas:
    ● el IMC calculado para el peso y altura almacenados en las variables
    ● una tabla informativa sobre el IMC para observar en qué tramo se
        encuentran el peso y altura utilizados.
 */
fun main() {
    print("Introduce peso (en kg): ")
    val peso = readln().toDouble()

    print("Introduce altura (en m): ")
    val altura = readln().toDouble()

    val inc = peso / (altura * altura)
    print("IMC: $inc")

    println("\n\nTABLA IMC")
    println("---------")
    println("Delgado: <18.5")
    println("Normal: entre 18.5 y 24.9")
    println("Sobrepeso: entre 25 y 29.9")
    println("Obeso: >=30 ")
}