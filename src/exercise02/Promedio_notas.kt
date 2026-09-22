package exercise02

fun main() {

    val nombre = "Samuel"

    val nota1 = 4.5
    val nota2 = 3.8
    val nota3 = 4.7

    val promedio = (nota1 + nota2 + nota3) / 3

    println("Estudiante: $nombre")
    println("Promedio: $promedio")

    if (promedio >= 3.0) {
        println("Estado: Aprobado")
    } else {
        println("Estado: Reprobado")
    }

    if (promedio >= 4.5) {
        println("El estudiante obtuvo un promedio excelente")
    }
}