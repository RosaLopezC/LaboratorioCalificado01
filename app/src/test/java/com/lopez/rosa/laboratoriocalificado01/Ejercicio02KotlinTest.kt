package com.lopez.rosa.laboratoriocalificado01

import org.junit.Test
import org.junit.Assert.*

class Ejercicio02KotlinTest {

    // Test para agregar y mostrar empleados
    @Test
    fun testAgregarYMostrarEmpleados() {
        val ejercicio02 = Ejercicio02Kotlin()

        val empleado1 = Empleado("Rosa", 32, 1500.0)
        val empleado2 = Empleado("Elena", 28, 1200.0)

        // Agrega empleados a la lista
        ejercicio02.agregarEmpleado(empleado1)
        ejercicio02.agregarEmpleado(empleado2)

        // Verifica que ambos empleados están en la lista
        assertTrue(ejercicio02.obtenerListaEmpleados().contains(empleado1))
        assertTrue(ejercicio02.obtenerListaEmpleados().contains(empleado2))
    }
}
