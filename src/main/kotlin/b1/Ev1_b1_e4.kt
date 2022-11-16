package b1
/*
    Intro_B1_E4.
    Dados unos segundos iniciales (500000 en el ejemplo) los distribuimos en días, horas,
    minutos y segundos como en el ejemplo que sigue.
    Para resolver el problema tendrás que usar la división entera tanto para obtener el
    cociente como el resto.
    Salida:
        500000 segundos = 5 días, 18 horas, 53 minutos y 20 segundos
 */
fun main(){
    val secsMin = 60
    val secsHour = 60 * secsMin
    val secsDay = 24 * secsHour

    print("Introduce los segundos: ")
    val secsOrigin =  readln().toInt()

    var secs = secsOrigin

    val  daysInSecs:Int = secs / secsDay

    secs %= secsDay
    val  hoursInSecs:Int = secs / secsHour

    secs %= secsHour
    val  minsInSecs:Int = secs / secsMin

    secs %= secsMin
    println("$secsOrigin segundos = $daysInSecs días, $hoursInSecs horas, $minsInSecs minuto y $secs segundos")

}