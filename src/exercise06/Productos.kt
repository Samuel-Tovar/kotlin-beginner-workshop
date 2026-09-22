package exercise06

class Product(
    val nombre: String,
    val precio: Double,
    val cantidadDisponible: Int
) {

    fun calcularValorInventario(): Double {
        return precio * cantidadDisponible
    }

    fun mostrarInformacion() {
        println("Producto: $nombre")
        println("Precio: $precio")
        println("Cantidad disponible: $cantidadDisponible")
        println("Valor total del inventario: ${calcularValorInventario()}")
        println()
    }
}

fun main() {

    val producto1 = Product("Teclado", 85000.0, 10)
    val producto2 = Product("Mouse", 45000.0, 15)
    val producto3 = Product("Monitor", 750000.0, 5)

    producto1.mostrarInformacion()
    producto2.mostrarInformacion()
    producto3.mostrarInformacion()
}