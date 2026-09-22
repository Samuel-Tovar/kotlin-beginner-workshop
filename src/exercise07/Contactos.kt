package exercise07

class Contact(
    val nombre: String,
    val telefono: String,
    val correo: String
)

fun agregarContacto(lista: MutableList<Contact>, contacto: Contact) {
    lista.add(contacto)
    println("Contacto agregado: ${contacto.nombre}")
}

fun listarContactos(lista: MutableList<Contact>) {

    println("Lista de contactos:")

    for (contacto in lista) {
        println(
            "Nombre: ${contacto.nombre} | " +
                    "Teléfono: ${contacto.telefono} | " +
                    "Correo: ${contacto.correo}"
        )
    }
}

fun buscarContacto(lista: MutableList<Contact>, nombre: String) {

    val contactoEncontrado = lista.find {
        it.nombre.equals(nombre, ignoreCase = true)
    }

    if (contactoEncontrado != null) {
        println("Contacto encontrado:")
        println("Nombre: ${contactoEncontrado.nombre}")
        println("Teléfono: ${contactoEncontrado.telefono}")
        println("Correo: ${contactoEncontrado.correo}")
    } else {
        println("El contacto $nombre no existe")
    }
}

fun eliminarContacto(lista: MutableList<Contact>, nombre: String) {

    val contactoEncontrado = lista.find {
        it.nombre.equals(nombre, ignoreCase = true)
    }

    if (contactoEncontrado != null) {
        lista.remove(contactoEncontrado)
        println("Contacto eliminado: $nombre")
    } else {
        println("El contacto $nombre no existe")
    }
}

fun main() {

    val contactos = mutableListOf(
        Contact("Ana", "3001234567", "ana@gmail.com"),
        Contact("Carlos", "3012345678", "carlos@gmail.com"),
        Contact("Laura", "3023456789", "laura@gmail.com"),
        Contact("Juan", "3034567890", "juan@gmail.com"),
        Contact("Maria", "3045678901", "maria@gmail.com")
    )

    listarContactos(contactos)

    println()

    agregarContacto(
        contactos,
        Contact("Pedro", "3056789012", "pedro@gmail.com")
    )

    println()

    buscarContacto(contactos, "Laura")

    println()

    eliminarContacto(contactos, "Carlos")

    println()

    listarContactos(contactos)
}