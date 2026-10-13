package exercise02

class Estudiante(
    val nombre: String,
    val nota1: Double,
    val nota2: Double,
    val nota3: Double
) {

    fun calcularPromedio(): Double {
        return (nota1 + nota2 + nota3) / 3
    }

    fun obtenerEstado(): String {
        val promedio = calcularPromedio()

        return if (promedio >= 3.0) {
            "Aprobado"
        } else {
            "Reprobado"
        }
    }

    fun obtenerRendimiento(): String {
        val promedio = calcularPromedio()

        return when {
            promedio >= 4.5 -> "Excelente"
            promedio >= 4.0 -> "Muy Bueno"
            promedio >= 3.5 -> "Bueno"
            promedio >= 3.0 -> "Regular"
            else -> "Insuficiente"
        }
    }
}


// =====================================================
// MENÚ PRINCIPAL
// =====================================================

fun mostrarMenu() {
    println(
        """
        ========== Student Manager ==========
        1. Registrar estudiantes
        2. Mostrar estudiantes
        3. Buscar estudiante
        4. Ver estadísticas del grupo
        0. Salir
        =====================================
        """.trimIndent()
    )
}


// =====================================================
// OPCIÓN 1 - REGISTRAR ESTUDIANTES
// =====================================================

fun registrarEstudiante(estudiantes: MutableList<Estudiante>) {

    print("Ingrese la cantidad de estudiantes: ")
    val cantidad = readln().toIntOrNull()

    if (cantidad == null || cantidad <= 0) {
        println("Cantidad inválida.")
        return
    }

    for (i in 1..cantidad) {

        println("\n========== Estudiante $i ==========")

        print("Ingrese el nombre del estudiante: ")
        val nombre = readln()

        val nota1 = leerNota("Ingrese la nota 1: ")
        val nota2 = leerNota("Ingrese la nota 2: ")
        val nota3 = leerNota("Ingrese la nota 3: ")

        val estudiante = Estudiante(
            nombre,
            nota1,
            nota2,
            nota3
        )

        estudiantes.add(estudiante)

        println("Estudiante registrado correctamente.")
    }
}


// =====================================================
// FUNCIÓN PARA VALIDAR NOTAS
// =====================================================

fun leerNota(mensaje: String): Double {

    while (true) {

        print(mensaje)

        val nota = readln().toDoubleOrNull()

        if (nota != null && nota in 0.0..5.0) {
            return nota
        }

        println("Nota inválida. Debe ingresar un valor entre 0.0 y 5.0.")
    }
}


// =====================================================
// OPCIÓN 2 - MOSTRAR ESTUDIANTES
// =====================================================

fun mostrarEstudiantes(estudiantes: List<Estudiante>) {

    if (estudiantes.isEmpty()) {
        println("No hay estudiantes registrados.")
        return
    }

    println("\n========== Lista de estudiantes ==========")

    for ((indice, estudiante) in estudiantes.withIndex()) {

        println("\nEstudiante ${indice + 1}")
        println("Nombre: ${estudiante.nombre}")
        println("Nota 1: ${estudiante.nota1}")
        println("Nota 2: ${estudiante.nota2}")
        println("Nota 3: ${estudiante.nota3}")
        println("Promedio: %.2f".format(estudiante.calcularPromedio()))
        println("Estado: ${estudiante.obtenerEstado()}")
        println("Rendimiento: ${estudiante.obtenerRendimiento()}")
    }
}


// =====================================================
// FUNCIÓN DE BÚSQUEDA
// =====================================================

fun buscarEstudiante(
    estudiantes: List<Estudiante>,
    nombre: String
): Estudiante? {

    for (estudiante in estudiantes) {

        if (estudiante.nombre.equals(nombre, ignoreCase = true)) {
            return estudiante
        }
    }

    return null
}


// =====================================================
// OPCIÓN 3 - BUSCAR ESTUDIANTE
// =====================================================

fun buscarEstudiante(estudiantes: List<Estudiante>) {

    if (estudiantes.isEmpty()) {
        println("No hay estudiantes registrados.")
        return
    }

    print("Ingrese el nombre del estudiante a buscar: ")
    val nombreBusqueda = readln()

    val estudianteEncontrado =
        buscarEstudiante(estudiantes, nombreBusqueda)

    if (estudianteEncontrado != null) {

        println("\n========== Estudiante encontrado ==========")
        println("Nombre: ${estudianteEncontrado.nombre}")
        println("Nota 1: ${estudianteEncontrado.nota1}")
        println("Nota 2: ${estudianteEncontrado.nota2}")
        println("Nota 3: ${estudianteEncontrado.nota3}")

        println(
            "Promedio: %.2f".format(
                estudianteEncontrado.calcularPromedio()
            )
        )

        println("Estado: ${estudianteEncontrado.obtenerEstado()}")
        println("Rendimiento: ${estudianteEncontrado.obtenerRendimiento()}")

    } else {

        println("Estudiante no encontrado.")
    }
}


// =====================================================
// OPCIÓN 4 - ESTADÍSTICAS
// =====================================================

fun mostrarEstadisticas(estudiantes: List<Estudiante>) {

    if (estudiantes.isEmpty()) {
        println("No hay estudiantes registrados.")
        return
    }

    var total = 0.0
    var aprobados = 0

    for (estudiante in estudiantes) {

        val promedio = estudiante.calcularPromedio()

        total += promedio

        if (promedio >= 3.0) {
            aprobados++
        }
    }

    val reprobados = estudiantes.size - aprobados
    val promedioGrupo = total / estudiantes.size

    println("\n========== Estadísticas del grupo ==========")
    println("Cantidad de estudiantes: ${estudiantes.size}")
    println("Promedio del grupo: %.2f".format(promedioGrupo))
    println("Cantidad de aprobados: $aprobados")
    println("Cantidad de reprobados: $reprobados")
}


// =====================================================
// MAIN
// =====================================================

fun main() {

    val estudiantes = mutableListOf<Estudiante>()

    var ejecutando = true

    while (ejecutando) {

        println()

        mostrarMenu()

        print("Seleccione una opción: ")

        val opcion = readln().toIntOrNull()

        println()

        when (opcion) {

            1 -> registrarEstudiante(estudiantes)

            2 -> mostrarEstudiantes(estudiantes)

            3 -> buscarEstudiante(estudiantes)

            4 -> mostrarEstadisticas(estudiantes)

            0 -> {
                println("Saliendo del programa...")
                ejecutando = false
            }

            else -> {
                println(
                    "Opción inválida. Por favor, seleccione una opción válida."
                )
            }
        }
    }
}