package exercise05

// =====================================================
// FUNCIÓN PARA DETERMINAR SI UN NÚMERO ES PRIMO
// =====================================================

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


// =====================================================
// FUNCIÓN PARA CALCULAR EL FACTORIAL
// =====================================================

fun factorial(number: Int): Long {

    var resultado = 1L

    for (i in 1..number) {
        resultado *= i
    }

    return resultado
}


// =====================================================
// FUNCIÓN PARA DETERMINAR SI UN NÚMERO ES PAR
// =====================================================

fun isEven(number: Int): Boolean {
    return number % 2 == 0
}


// =====================================================
// FUNCIÓN PARA LEER Y VALIDAR EL NÚMERO
// =====================================================

fun leerNumero(): Int {

    while (true) {

        print("Ingrese un número entero no negativo: ")

        val numero = readln().toIntOrNull()

        if (numero != null && numero >= 0) {
            return numero
        }

        println("Número inválido. Intente nuevamente.")
    }
}


// =====================================================
// MAIN
// =====================================================

fun main() {

    var continuar = true

    while (continuar) {

        println("\n========== Funciones matemáticas ==========")

        val numero = leerNumero()

        println("\nResultados:")
        println("Número: $numero")
        println("¿Es primo?: ${isPrime(numero)}")
        println("Factorial: ${factorial(numero)}")
        println("¿Es par?: ${isEven(numero)}")

        println("\n¿Desea analizar otro número? (s/n)")
        val respuesta = readln()

        if (!respuesta.equals("s", ignoreCase = true)) {
            continuar = false
        }
    }

    println("\nPrograma finalizado.")
}