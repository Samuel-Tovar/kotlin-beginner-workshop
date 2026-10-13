package exercise07

// =====================================================
// CLASE CONTACT
// =====================================================

class Contact(
    val nombre: String,
    val telefono: String,
    val correo: String
)


// =====================================================
// AGREGAR CONTACTO
// =====================================================

fun agregarContacto(lista: MutableList<Contact>) {

    println("\n========== Agregar contacto ==========")

    print("Ingrese el nombre: ")
    val nombre = readln()

    print("Ingrese el teléfono: ")
    val telefono = readln()

    print("Ingrese el correo: ")
    val correo = readln()

    val contacto = Contact(
        nombre,
        telefono,
        correo
    )

    lista.add(contacto)

    println("Contacto agregado correctamente.")
}


// =====================================================
// LISTAR CONTACTOS
// =====================================================

fun listarContactos(lista: List<Contact>) {

    if (lista.isEmpty()) {
        println("No hay contactos registrados.")
        return
    }

    println("\n========== Lista de contactos ==========")

    for ((indice, contacto) in lista.withIndex()) {

        println("\nContacto ${indice + 1}")
        println("Nombre: ${contacto.nombre}")
        println("Teléfono: ${contacto.telefono}")
        println("Correo: ${contacto.correo}")
    }
}


// =====================================================
// BUSCAR CONTACTO
// =====================================================

fun buscarContacto(lista: List<Contact>) {

    if (lista.isEmpty()) {
        println("No hay contactos registrados.")
        return
    }

    print("Ingrese el nombre del contacto a buscar: ")

    val nombre = readln()

    val contactoEncontrado = lista.find {
        it.nombre.equals(nombre, ignoreCase = true)
    }

    if (contactoEncontrado != null) {

        println("\n========== Contacto encontrado ==========")
        println("Nombre: ${contactoEncontrado.nombre}")
        println("Teléfono: ${contactoEncontrado.telefono}")
        println("Correo: ${contactoEncontrado.correo}")

    } else {

        println("El contacto $nombre no existe.")
    }
}


// =====================================================
// ELIMINAR CONTACTO
// =====================================================

fun eliminarContacto(lista: MutableList<Contact>) {

    if (lista.isEmpty()) {
        println("No hay contactos registrados.")
        return
    }

    print("Ingrese el nombre del contacto a eliminar: ")

    val nombre = readln()

    val contactoEncontrado = lista.find {
        it.nombre.equals(nombre, ignoreCase = true)
    }

    if (contactoEncontrado != null) {

        lista.remove(contactoEncontrado)

        println("Contacto eliminado correctamente.")

    } else {

        println("El contacto $nombre no existe.")
    }
}


// =====================================================
// MENÚ
// =====================================================

fun mostrarMenu() {

    println(
        """
        ======== Agenda de contactos ========
        1. Agregar contacto
        2. Listar contactos
        3. Buscar contacto
        4. Eliminar contacto
        0. Salir
        =====================================
        """.trimIndent()
    )
}


// =====================================================
// MAIN
// =====================================================

fun main() {

    val contactos = mutableListOf(
        Contact("Ana", "3001234567", "ana@gmail.com"),
        Contact("Carlos", "3012345678", "carlos@gmail.com"),
        Contact("Laura", "3023456789", "laura@gmail.com"),
        Contact("Juan", "3034567890", "juan@gmail.com"),
        Contact("Maria", "3045678901", "maria@gmail.com")
    )

    var ejecutando = true

    while (ejecutando) {

        println()

        mostrarMenu()

        print("Seleccione una opción: ")

        val opcion = readln().toIntOrNull()

        when (opcion) {

            1 -> agregarContacto(contactos)

            2 -> listarContactos(contactos)

            3 -> buscarContacto(contactos)

            4 -> eliminarContacto(contactos)

            0 -> {
                println("Saliendo de la agenda...")
                ejecutando = false
            }

            else -> {
                println("Opción inválida.")
            }
        }
    }
}