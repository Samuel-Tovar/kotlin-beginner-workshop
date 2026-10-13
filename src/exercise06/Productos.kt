package exercise06

// =====================================================
// CLASE PRODUCT
// =====================================================

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
        println("Precio: $%.2f".format(precio))
        println("Cantidad disponible: $cantidadDisponible")
        println(
            "Valor total del inventario: $%.2f".format(
                calcularValorInventario()
            )
        )
        println()
    }
}


// =====================================================
// FUNCIÓN PARA LEER EL PRECIO
// =====================================================

fun leerPrecio(): Double {

    while (true) {

        print("Ingrese el precio del producto: ")

        val precio = readln().toDoubleOrNull()

        if (precio != null && precio > 0) {
            return precio
        }

        println("Precio inválido. Debe ingresar un valor mayor que 0.")
    }
}


// =====================================================
// FUNCIÓN PARA LEER LA CANTIDAD
// =====================================================

fun leerCantidad(): Int {

    while (true) {

        print("Ingrese la cantidad disponible: ")

        val cantidad = readln().toIntOrNull()

        if (cantidad != null && cantidad >= 0) {
            return cantidad
        }

        println("Cantidad inválida. Ingrese un número entero mayor o igual a 0.")
    }
}


// =====================================================
// FUNCIÓN PARA LEER LA CANTIDAD DE PRODUCTOS
// =====================================================

fun leerCantidadProductos(): Int {

    while (true) {

        print("¿Cuántos productos desea registrar? (mínimo 3): ")

        val cantidad = readln().toIntOrNull()

        if (cantidad != null && cantidad >= 3) {
            return cantidad
        }

        println("Debe registrar como mínimo 3 productos.")
    }
}


// =====================================================
// MAIN
// =====================================================

fun main() {

    val productos = mutableListOf<Product>()

    println("========== Gestión de productos ==========")

    val cantidadProductos = leerCantidadProductos()

    for (i in 1..cantidadProductos) {

        println("\n========== Producto $i ==========")

        print("Ingrese el nombre del producto: ")
        val nombre = readln()

        val precio = leerPrecio()
        val cantidad = leerCantidad()

        val producto = Product(
            nombre,
            precio,
            cantidad
        )

        productos.add(producto)

        println("Producto registrado correctamente.")
    }

    println("\n========== Inventario ==========\n")

    for (producto in productos) {
        producto.mostrarInformacion()
    }
}