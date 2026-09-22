package exercise03

fun main() {

    val numero = 7
    var suma = 0

    for (i in 1..10) {

        val resultado = numero * i

        println("$numero x $i = $resultado")

        suma += resultado
    }

    println("La suma de todos los resultados es: $suma")
}