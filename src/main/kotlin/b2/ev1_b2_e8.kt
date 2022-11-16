package b2

/*
    Intro_B2_E8
    Introduces un número del mes y te devuelve su estación.
    Resuélvelo con when con rangos en las ramas.
    Salida:
    Month = 5
    Spring
 */
/*
Primavera: inicia el 20 de marzo y finaliza el 21 de junio.
Verano:    inicia el 21 de junio y finaliza el 23 de septiembre.
Otoño:     inicia el 23 de septiembre y finaliza el 21 de diciembre.
Invierno:  inicia el 21 de diciembre y finaliza el 20 de marzo.
 */
fun main() {
    print("mouth = ")
    val numMouth = readln().toInt()

    val estacion = when (numMouth) {
        1, 2, 12 -> {
            if (numMouth == 12) {
                "Invierno, (Excepto anterior 21/12, que será Otoño)"
            } else {
                "Invierno"
            }
        }

        in 3..5 -> {
            if (numMouth == 3) {
                "Primavera, (Excepto anterior 20/3, que será Invierno)"
            } else {
                "Primavera"
            }
        }

        in 6..8 -> {
            if (numMouth == 6) {
                "Verano, (Excepto anterior 21/6, que será Primavera)"
            } else {
                "Verano"
            }
        }

        in 9..11 -> {
            if (numMouth == 9) {
                "Otoño, (Excepto anterior 23/9, que será Verano)"
            } else {
                "Otoño"
            }
        }

        else -> "No existe"
    }
    println(estacion)
}