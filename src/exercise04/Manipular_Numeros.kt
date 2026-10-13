package exercise04


// =====================================================
// FUNCIÓN PARA LEER NÚMEROS ENTEROS
// =====================================================

fun leerEntero(mensaje: String): Int {

    while (true) {

        print(mensaje)

        val numero = readln().toIntOrNull()

        if (numero != null) {
            return numero
        }

        println("Valor inválido. Ingrese un número entero.")
    }
}


// =====================================================
// REGISTRAR NÚMEROS
// =====================================================

fun registrarNumeros(): MutableList<Int> {

    val numeros = mutableListOf<Int>()

    var cantidad: Int

    while (true) {

        cantidad = leerEntero(
            "¿Cuántos números desea ingresar?: "
        )

        if (cantidad > 0) {
            break
        }

        println(
            "La cantidad debe ser mayor que cero."
        )
    }


    println(
        "\n========== INGRESO DE NÚMEROS =========="
    )


    for (i in 1..cantidad) {

        val numero = leerEntero(
            "Ingrese el número $i: "
        )

        numeros.add(numero)
    }


    return numeros
}


// =====================================================
// ANALIZAR LISTA
// =====================================================

fun analizarNumeros(numeros: List<Int>) {

    var suma = 0
    var pares = 0
    var impares = 0

    var mayor = numeros[0]
    var menor = numeros[0]


    println(
        "\n========== ELEMENTOS DE LA LISTA =========="
    )


    for (numero in numeros) {

        println(numero)

        suma += numero


        // -----------------------------
        // PARES E IMPARES
        // -----------------------------

        if (numero % 2 == 0) {

            pares++

        } else {

            impares++
        }


        // -----------------------------
        // MAYOR
        // -----------------------------

        if (numero > mayor) {
            mayor = numero
        }


        // -----------------------------
        // MENOR
        // -----------------------------

        if (numero < menor) {
            menor = numero
        }
    }


    val promedio =
        suma.toDouble() / numeros.size


    // =================================================
    // RESULTADOS
    // =================================================

    println(
        "\n========== RESULTADOS =========="
    )

    println(
        "Cantidad de números: ${numeros.size}"
    )

    println(
        "Suma: $suma"
    )

    println(
        "Promedio: %.2f".format(promedio)
    )

    println(
        "Número mayor: $mayor"
    )

    println(
        "Número menor: $menor"
    )

    println(
        "Cantidad de pares: $pares"
    )

    println(
        "Cantidad de impares: $impares"
    )
}


// =====================================================
// MAIN
// =====================================================

fun main() {

    var continuar = true


    while (continuar) {

        println(
            """
            
            ========== ANALIZADOR DE NÚMEROS ==========
            """.trimIndent()
        )


        val numeros =
            registrarNumeros()


        analizarNumeros(
            numeros
        )


        println()

        print(
            "¿Desea analizar otra lista? (s/n): "
        )


        val respuesta =
            readln()
                .trim()
                .lowercase()


        continuar =
            respuesta == "s" ||
                    respuesta == "si" ||
                    respuesta == "sí"
    }


    println(
        "\nPrograma finalizado."
    )
}