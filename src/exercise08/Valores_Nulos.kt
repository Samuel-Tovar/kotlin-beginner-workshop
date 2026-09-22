package exercise08

fun saludarUsuario(nombre: String?): String {

    return if (!nombre.isNullOrBlank()) {
        "Hola, $nombre"
    } else {
        "Hola, usuario"
    }
}

fun main() {

    println(saludarUsuario("Samuel"))
    println(saludarUsuario(null))
    println(saludarUsuario(""))
    println(saludarUsuario("   "))
}