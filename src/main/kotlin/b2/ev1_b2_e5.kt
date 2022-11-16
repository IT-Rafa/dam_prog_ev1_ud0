package b2
/*
    Intro_B2_E5
    En una granja se compra diariamente una cantidad de alimento, comidaDiaria,
    para alimentar a los animales. El número de animales de la granja, todos de la
    misma especie, es numAnimales y, cada animal, necesita comer diariamente la
    cantidad kilosPorAnimal.
    El programa solicitará al usuario la entrada de los valores anteriores y, en
    función de ellos, determinará según el caso:

    - el excedente o kilos de comida sobrante ("Excedente = <num> Kg")
    - la ración por animal, en caso de que no haya comida suficiente
        ("Ración = <num> Kg")

    EJEMPLOS
    Comida diaria: 120
    Número animales: 32
    Kilos por animal: 1.5
    Excedente = 72.0 Kg

    Comida diaria: 25
    Número animales: 32
    Kilos por animal: 1.5
    Excedente = 0.78125 Kg
 */
fun main(){
    print("Comida diaria: ")
    val comidaDiaria = readln().toDouble()
    print("Número animales: ")
    val numAnimales = readln().toInt()
    print("Kilos por animal: ")
    val kilosPorAnimal = readln().toDouble()

    val comida = numAnimales * kilosPorAnimal
    if(comidaDiaria >= comida)
        println("Excedente = "+ (comidaDiaria-comida)+" Kg")
    else
        println("Ración = "+ (comidaDiaria/numAnimales)+" Kg")
}