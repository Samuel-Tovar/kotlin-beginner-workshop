package exercise04

fun main() {

    val numeros = listOf(12, 38, 25, 8, 14, 3, 19, 20, 6, 11)

    var suma = 0
    var pares = 0
    var impares = 0

    var mayor = numeros[0]
    var menor = numeros[0]

    println("Elementos de la lista:")

    for (numero in numeros) {

        println(numero)

        suma += numero

        if (numero % 2 == 0) {
            pares++
        } else {
            impares++
        }

        if (numero > mayor) {
            mayor = numero
        }

        if (numero < menor) {
            menor = numero
        }
    }

    val promedio = suma.toDouble() / numeros.size

    println()
    println("Suma: $suma")
    println("Promedio: $promedio")
    println("Mayor: $mayor")
    println("Menor: $menor")
    println("Cantidad de pares: $pares")
    println("Cantidad de impares: $impares")
}