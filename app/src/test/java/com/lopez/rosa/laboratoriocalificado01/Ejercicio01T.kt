package com.lopez.rosa.laboratoriocalificado01

import org.junit.Test
import org.junit.Assert.*

// Esta es la clase de prueba para probar la funcionalidad de la clase Ejercicio01
class Ejercicio01T {

    // Este test prueba si se pueden agregar contactos correctamente a la agenda
    @Test
    fun testAgregarContacto() {
        // Se crea una nueva instancia de la clase Agenda
        val agenda = Ejercicio01.Agenda()

        // Se crea un nuevo contacto con nombre, teléfono y email
        val contacto = Ejercicio01.Contacto("Rosa", "123456789", "rosa@correo.com")

        // Se agrega el contacto a la agenda
        agenda.agregarContacto(contacto)

        // Se busca el contacto por email para verificar que fue agregado correctamente
        val encontradoPorEmail = agenda.buscarContactoEmail("rosa@correo.com")

        // Se comprueba que el contacto no es nulo, es decir, que sí fue encontrado
        assertNotNull(encontradoPorEmail)
    }

    // Este test prueba si se puede buscar un contacto por teléfono
    @Test
    fun testBuscarContactoTelefono() {
        // Se crea una nueva instancia de la clase Agenda
        val agenda = Ejercicio01.Agenda()

        // Se crea un nuevo contacto
        val contacto = Ejercicio01.Contacto("Elena", "987654321", "elena@correo.com")

        // Se agrega el contacto a la agenda
        agenda.agregarContacto(contacto)

        // Se busca el contacto por teléfono para verificar que está en la agenda
        val encontradoPorTelefono = agenda.buscarContactoTelefono("987654321")

        // Se comprueba que el contacto no es nulo, es decir, que sí fue encontrado
        assertNotNull(encontradoPorTelefono)
    }

    // Este test prueba si se puede mostrar correctamente la lista de contactos
    @Test
    fun testMostrarContactos() {
        // Se crea una nueva instancia de la clase Agenda
        val agenda = Ejercicio01.Agenda()

        // Se agregan dos contactos a la agenda
        val contacto1 = Ejercicio01.Contacto("Rosa", "123456789", "rosa@correo.com")
        val contacto2 = Ejercicio01.Contacto("Elena", "987654321", "elena@correo.com")
        agenda.agregarContacto(contacto1)
        agenda.agregarContacto(contacto2)

        // Se muestra la lista de contactos y se espera que no esté vacía
        agenda.mostrarContactos()

        // Aquí solo estamos verificando que el método se ejecuta sin errores
        // Podrías mejorar la prueba capturando la salida en consola
        assertTrue(agenda.buscarContactoEmail("rosa@correo.com") != null)
        assertTrue(agenda.buscarContactoEmail("elena@correo.com") != null)
    }
}
