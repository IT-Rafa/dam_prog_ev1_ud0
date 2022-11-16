package b2
/*
    Intro_B2_E2
    Recuerda el cálculo del IMC: IMC = peso(kg) / (altura elev 2)(m) y la siguiente tabla de IMC

    IMC                 Descripción
    < 18.5              Delgado
    >=18.5 y <=24.9     Normal
    >24.9 y <=29.9      Sobrepeso
    >29.9               Obeso

    Se pide mejorar el ejercicio ya hecho de IMC de forma que ahora el funcionamiento sea
    similar a como muestra el ejemplo:
    Altura: 1.66
    Peso: 74.8
    Su IMC es 27.144723472202063, por tanto, su estado es: Sobrepeso
 */
fun main() {
    val minNormal = 18.5
    val maxNormal = 24.9
    val maxSobrepeso = 29.9

    print("Altura: ")
    val altura = readln().toDouble()
    print("Peso: ")
    val peso = readln().toDouble()

    val imc = peso / (altura * altura)

    val estado =
        if (imc < minNormal) {
            "delgado"
        } else if (imc <= maxNormal) {
            "normal"
        } else if (imc <= maxSobrepeso) {
            "sobrepeso"
        } else {
            "obeso"
        }

    println("Su IMC es $imc, por tanto, su estado es $estado")
}