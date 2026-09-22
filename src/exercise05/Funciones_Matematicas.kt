package exercise05

fun isPrime(number: Int): Boolean {

    if (number < 2) {
        return false
    }

    for (i in 2 until number) {
        if (number % i == 0) {
            return false
        }
    }

    return true
}

fun factorial(number: Int): Long {

    var resultado = 1L

    for (i in 1..number) {
        resultado *= i
    }

    return resultado
}

fun isEven(number: Int): Boolean {

    return number % 2 == 0
}

fun main() {

    val numero = 13

    println("Número: $numero")
    println("¿Es primo?: ${isPrime(numero)}")
    println("Factorial: ${factorial(numero)}")
    println("¿Es par?: ${isEven(numero)}")
}