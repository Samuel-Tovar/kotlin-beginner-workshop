package exercise01


// =====================================================
// FUNCIÓN PARA LEER NÚMEROS
// =====================================================

fun leerNumero(mensaje: String): Double {

    while (true) {

        print(mensaje)

        val numero = readln().toDoubleOrNull()

        if (numero != null) {
            return numero
        }

        println("Valor inválido. Ingrese un número válido.")
    }
}


// =====================================================
// FUNCIÓN PARA LEER LA OPERACIÓN
// =====================================================

fun leerOperacion(): String {

    while (true) {

        println(
            """
            Seleccione una operación:
            +  Suma
            -  Resta
            *  Multiplicación
            /  División
            """.trimIndent()
        )

        print("Operación: ")

        val operacion = readln().trim()

        if (
            operacion == "+" ||
            operacion == "-" ||
            operacion == "*" ||
            operacion == "/"
        ) {
            return operacion
        }

        println("Operación no válida. Intente nuevamente.\n")
    }
}


// =====================================================
// REALIZAR OPERACIÓN
// =====================================================

fun calcular(
    numero1: Double,
    numero2: Double,
    operacion: String
) {

    when (operacion) {

        "+" -> {
            println(
                "Resultado: $numero1 + $numero2 = ${numero1 + numero2}"
            )
        }


        "-" -> {
            println(
                "Resultado: $numero1 - $numero2 = ${numero1 - numero2}"
            )
        }


        "*" -> {
            println(
                "Resultado: $numero1 * $numero2 = ${numero1 * numero2}"
            )
        }


        "/" -> {

            if (numero2 != 0.0) {

                println(
                    "Resultado: $numero1 / $numero2 = ${numero1 / numero2}"
                )

            } else {

                println(
                    "Error: no se puede dividir entre cero."
                )
            }
        }
    }
}


// =====================================================
// MAIN
// =====================================================

fun main() {

    var continuar = true

    while (continuar) {

        println(
            """
            
            ========== CALCULADORA ==========
            """.trimIndent()
        )


        val numero1 =
            leerNumero("Ingrese el primer número: ")

        val numero2 =
            leerNumero("Ingrese el segundo número: ")


        println()

        val operacion =
            leerOperacion()


        println()

        calcular(
            numero1,
            numero2,
            operacion
        )


        println()

        print("¿Desea realizar otra operación? (s/n): ")

        val respuesta =
            readln()
                .trim()
                .lowercase()


        continuar =
            respuesta == "s" ||
                    respuesta == "si" ||
                    respuesta == "sí"
    }


    println("\nPrograma finalizado.")
}