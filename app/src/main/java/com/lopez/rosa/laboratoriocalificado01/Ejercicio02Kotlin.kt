package com.lopez.rosa.laboratoriocalificado01

// Clase Empleado que define las propiedades de un empleado
class Empleado(val nombre: String, val edad: Int, val salarioBase: Double) {

    // Método para calcular el salario total del empleado
    fun calcularSalarioTotal(): Double {
        // Si el empleado tiene más de 30 años, se le aplica un bono del 10%
        return if (edad > 30) {
            salarioBase * 1.1 // Salario base más 10%
        } else {
            salarioBase // Sin bono si tiene 30 años o menos
        }
    }
}

// Clase para gestionar la lista de empleados y mostrar su información
class Ejercicio02Kotlin {

    // Lista mutable privada para almacenar los empleados
    private val listaEmpleados = mutableListOf<Empleado>()

    // Función para agregar un empleado a la lista
    fun agregarEmpleado(empleado: Empleado) {
        listaEmpleados.add(empleado) // Añade el empleado a la lista
    }

    // Función para recorrer la lista y mostrar el nombre, edad y salario total de cada empleado
    fun mostrarEmpleados() {
        if (listaEmpleados.isEmpty()) {
            println("No hay empleados en la lista.")
        } else {
            // Recorre cada empleado y muestra sus datos
            listaEmpleados.forEach { empleado ->
                println("Nombre: ${empleado.nombre}, Edad: ${empleado.edad}, Salario Total: ${empleado.calcularSalarioTotal()}")
            }
        }
    }

    // Método para obtener la lista de empleados
    fun obtenerListaEmpleados(): List<Empleado> {
        return listaEmpleados // Retorna la lista de empleados
    }
}

// Función main para probar el sistema de empleados
fun main() {
    // Se crean algunos empleados con diferentes edades y salarios base
    val ejercicio = Ejercicio02Kotlin() // Instancia de Ejercicio02Kotlin

    val empleado1 = Empleado("Rosa", 32, 1500.0)
    val empleado2 = Empleado("Elena", 28, 1200.0)

    // Se agregan los empleados a la lista
    ejercicio.agregarEmpleado(empleado1)
    ejercicio.agregarEmpleado(empleado2)

    // Se muestran los empleados y sus salarios calculados
    ejercicio.mostrarEmpleados()
}
