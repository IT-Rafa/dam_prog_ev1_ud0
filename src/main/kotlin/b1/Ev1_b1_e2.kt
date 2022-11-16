package b1
/*
    Intro_B1_E2:
    En este ejercicio tenemos que intercambiar el valor de dos variables.
    El intercambio de variables es muy importante entenderlo bien pues se
    utiliza mucho en to_do tipo de programas.
    En el siguiente código, la variable z la usarás como variable intermedia
    o de apoyo para conseguir que x e  intercambien correctamente sus valores.
 */
fun main() {
    var x=10
    var y=20
    val z:Int
    println("ANTES: x vale "+ x + " y vale "+y )

    z=x
    x=y
    y=z
    println("DESPUES: x vale $x y vale $y" )
}