package exercise01

fun main() {

    val numero1 = 20.0
    val numero2 = 5.0
    val operacion = "*"

    when (operacion) {

        "+" -> {
            println("Resultado: ${numero1 + numero2}")
        }

        "-" -> {
            println("Resultado: ${numero1 - numero2}")
        }

        "*" -> {
            println("Resultado: ${numero1 * numero2}")
        }

        "/" -> {
            if (numero2 != 0.0) {
                println("Resultado: ${numero1 / numero2}")
            } else {
                println("Error: no se puede dividir entre cero")
            }
        }

        else -> {
            println("Operación no válida")
        }
    }
}