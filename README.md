# Kotlin Beginner Workshop

## Descripción

Taller de introducción a Kotlin enfocado en el aprendizaje y aplicación de los fundamentos básicos del lenguaje de programación.

El proyecto está compuesto por ocho ejercicios independientes desarrollados en Kotlin. A lo largo de los ejercicios se trabajan conceptos como variables, tipos de datos, condicionales, ciclos, funciones, colecciones, clases, objetos, listas mutables, entrada de datos por consola, validación de información y manejo seguro de valores nulos.

Los ejercicios fueron organizados en paquetes independientes dentro de la carpeta `src`.

## Ejercicios

### 1. Calculadora básica

Calculadora que permite trabajar con operaciones matemáticas básicas:

- Suma
- Resta
- Multiplicación
- División
- Validación de división entre cero

Se utiliza la estructura `when` para seleccionar la operación correspondiente.

### 2. Gestión de estudiantes

Sistema para administrar información de estudiantes.

Permite:

- Registrar uno o varios estudiantes
- Ingresar y validar tres notas entre 0.0 y 5.0
- Calcular el promedio de cada estudiante
- Determinar si el estudiante está aprobado o reprobado
- Clasificar su rendimiento académico
- Mostrar todos los estudiantes registrados
- Buscar estudiantes por nombre
- Consultar estadísticas generales del grupo

El programa utiliza una clase `Estudiante`, listas mutables, funciones, ciclos, condicionales y un menú interactivo.

### 3. Tabla de multiplicar

Programa que genera la tabla de multiplicar de un número utilizando un ciclo `for`.

También calcula la suma de todos los resultados obtenidos en la tabla.

### 4. Análisis de una lista

Programa que trabaja con una colección de números enteros y permite:

- Mostrar los elementos
- Calcular la suma
- Calcular el promedio
- Identificar el número mayor
- Identificar el número menor
- Contar números pares
- Contar números impares

### 5. Funciones matemáticas

Programa interactivo que permite ingresar un número y analizarlo mediante diferentes funciones.

Incluye:

- `isPrime()` para determinar si el número es primo
- `factorial()` para calcular su factorial
- `isEven()` para determinar si es par

El programa valida la entrada del usuario y permite analizar varios números durante una misma ejecución.

### 6. Gestión de productos

Sistema para registrar productos utilizando la clase `Product`.

Cada producto contiene:

- Nombre
- Precio
- Cantidad disponible

El programa permite registrar múltiples productos, valida los datos ingresados y calcula automáticamente el valor total del inventario de cada producto.

### 7. Agenda de contactos

Agenda interactiva desarrollada con una lista mutable de objetos `Contact`.

Permite:

- Agregar contactos
- Listar contactos
- Buscar contactos por nombre
- Eliminar contactos
- Informar cuando un contacto no existe

Cada contacto contiene nombre, teléfono y correo electrónico.

El programa utiliza un menú para seleccionar las diferentes operaciones.

### 8. Manejo de valores nulos

Programa que demuestra el manejo seguro de valores nulos en Kotlin utilizando `String?`.

Permite ingresar un nombre de usuario y:

- Mostrar un saludo personalizado cuando existe un nombre válido
- Mostrar un saludo genérico cuando el nombre es nulo, vacío o contiene únicamente espacios

Se utiliza `isNullOrBlank()` y no se utiliza el operador `!!`.

## Estructura del proyecto

```text
kotlin-beginner-workshop/
│
├── src/
│   ├── exercise01/
│   ├── exercise02/
│   ├── exercise03/
│   ├── exercise04/
│   ├── exercise05/
│   ├── exercise06/
│   ├── exercise07/
│   └── exercise08/
│
├── README.md
└── .gitignore