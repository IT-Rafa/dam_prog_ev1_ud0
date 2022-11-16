package b1
/*
    Intro_ B1_E7
    prueba las siguientes expresiones true&&true, true&&false, false&&true
    false&&false, de forma que nuestro programa sea capaz de imprimir la tabla del
    AND con un aspecto similar al siguiente:

    x      y     resultado
    ----------------------
    true   true     true
    true   false    false
    false  true     false
    false  false    false

    lógicamente, la columna resultado debes calcularla con las expresiones de
    arriba, no hagas directamente al impresión del resultado
 */
fun main() {
    println("x      y     resultado")
    println("----------------------")
    println("true   true     ${true  && true}")
    println("true   false    ${true  && false}")
    println("false  true     ${false  && true}")
    println("false  false    ${false  && false}")
}