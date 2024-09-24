package com.lopez.rosa.laboratoriocalificado01

// Esta clase principal Ejercicio01 servirá para implementar la Agenda y probar el código
class Ejercicio01 {

    // Clase Contacto que define un contacto con nombre, teléfono y email
    class Contacto(val nombre: String, val telefono: String, val email: String)

    // Clase Agenda que gestionará una lista de contactos
    class Agenda {
        // Se crea una lista mutable para almacenar los contactos
        private val listaContactos = mutableListOf<Contacto>()

        // Método para agregar un contacto a la lista
        fun agregarContacto(contacto: Contacto) {
            listaContactos.add(contacto) // Se añade el contacto a la lista
        }

        // Método para mostrar todos los contactos guardados en la agenda
        fun mostrarContactos() {
            if (listaContactos.isEmpty()) {
                // Si la lista está vacía, imprime que no hay contactos
                println("No hay contactos en la agenda.")
            } else {
                // Si hay contactos, los recorre e imprime cada uno con su información
                println("Lista de contactos:")
                listaContactos.forEach { contacto ->
                    println("Nombre: ${contacto.nombre}, Teléfono: ${contacto.telefono}, Email: ${contacto.email}")
                }
            }
        }

        // Método para buscar un contacto por su email
        fun buscarContactoEmail(email: String): Contacto? {
            // Busca en la lista el contacto que coincida con el email y lo devuelve
            return listaContactos.find { it.email == email }
        }

        // Método para buscar un contacto por su número de teléfono
        fun buscarContactoTelefono(telefono: String): Contacto? {
            // Busca en la lista el contacto que coincida con el teléfono y lo devuelve
            return listaContactos.find { it.telefono == telefono }
        }
    }

    // Función main para probar la clase Agenda y sus funcionalidades
    fun main() {
        // Se crea una nueva agenda
        val agenda = Agenda()

        // Se crean dos contactos nuevos con nombre, teléfono y email
        val contacto1 = Contacto("Rosa", "123456789", "rosa@correo.com")
        val contacto2 = Contacto("Elena", "987654321", "elena@correo.com")

        // Se agregan los dos contactos a la agenda
        agenda.agregarContacto(contacto1)
        agenda.agregarContacto(contacto2)

        // Se muestra la lista de contactos que hay en la agenda
        agenda.mostrarContactos()

        // Se busca un contacto en la agenda por email
        val encontradoPorEmail = agenda.buscarContactoEmail("rosa@correo.com")
        // Si el contacto fue encontrado, imprime su nombre
        println("Contacto encontrado por email: ${encontradoPorEmail?.nombre}")

        // Se busca un contacto en la agenda por teléfono
        val encontradoPorTelefono = agenda.buscarContactoTelefono("987654321")
        // Si el contacto fue encontrado, imprime su nombre
        println("Contacto encontrado por teléfono: ${encontradoPorTelefono?.nombre}")
    }
}
