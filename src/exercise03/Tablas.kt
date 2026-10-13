package exercise03


// =====================================================
// FUNCIÓN PARA LEER ENTEROS
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
// MOSTRAR TABLA
// =====================================================

fun mostrarTabla(
    numero: Int,
    limite: Int
) {

    var suma = 0

    println(
        "\n========== TABLA DEL $numero =========="
    )


    for (i in 1..limite) {

        val resultado =
            numero * i

        println(
            "$numero x $i = $resultado"
        )

        suma += resultado
    }


    println(
        "\nLa suma de todos los resultados es: $suma"
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
            
            ========== TABLA DE MULTIPLICAR ==========
            """.trimIndent()
        )


        val numero =
            leerEntero(
                "Ingrese el número de la tabla: "
            )


        var limite: Int

        while (true) {

            limite =
                leerEntero(
                    "¿Hasta qué número desea multiplicar?: "
                )

            if (limite > 0) {
                break
            }

            println(
                "El límite debe ser mayor que 0."
            )
        }


        mostrarTabla(
            numero,
            limite
        )


        println()

        print(
            "¿Desea generar otra tabla? (s/n): "
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