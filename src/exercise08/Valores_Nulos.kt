package exercise08

// =====================================================
// FUNCIÓN PARA SALUDAR AL USUARIO
// =====================================================

fun saludarUsuario(nombre: String?): String {

    return if (!nombre.isNullOrBlank()) {
        "Hola, $nombre"
    } else {
        "Hola, usuario"
    }
}


// =====================================================
// MAIN
// =====================================================

fun main() {

    var continuar = true

    while (continuar) {

        println("\n========== Saludo de usuario ==========")

        print("Ingrese su nombre (puede dejarlo vacío): ")

        val entrada = readln()

        val nombre: String? = if (entrada.isBlank()) {
            null
        } else {
            entrada
        }

        println(saludarUsuario(nombre))

        println("\n¿Desea probar otro nombre? (s/n)")
        val respuesta = readln()

        if (!respuesta.equals("s", ignoreCase = true)) {
            continuar = false
        }
    }

    println("\nPrograma finalizado.")
}