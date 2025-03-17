package org.example.view

class Consola {
    package view

    class Consola {

        fun mostrarMenuAdmin(){
            println("1. Usuarios\n" +
                    "2. Seguros\n" +
                    "3. Salir")


        }

        fun opcionMenuAdmin(){
            while (true){
                try{
                    val tipoOpcion = readln().toInt()
                    when(tipoOpcion){
                        1 ->{
                            println("1. Nuevo usuario\n" +
                                    "2. Eliminar usuario\n" +
                                    "3. Cambiar contraseña")
                            val opcionUsuarioAdmin = readln().toInt()
                            when(opcionUsuarioAdmin){
                            1 -> crearUsuario()
                            2 -> eliminarUsuario()
                            3 -> cambiarContraseña()
                                else -> {
                                    println("ERROR. Opción no válida.")
                                }
                            }
                        }
                        2 ->{
                            println("1. Contratar Seguro\n" +
                                    "2. Editar Seguro (ingresar ID)\n" +
                                    "3. Eliminar Seguro (ingresar ID)\n" +
                                    "4. Listar Seguros")
                            val opcionSegurosAdmin = readln().toInt()
                            when(opcionSegurosAdmin){
                                1 -> {
                                    println("1. Hogar\n" +
                                            "2. Coche\n" +
                                            "3. Moto")
                                    val opcionTipoSeguro = readln().toInt()
                                    when(opcionTipoSeguro){
                                    1 -> contratarSeguroHogar()
                                    2 -> contratarSeguroCoche()
                                    3 -> contratarSeguroMoto()
                                        else -> {
                                            println("ERROR. Opción inválida.")
                                        }
                                    }
                                }
                            2 -> editarSeguro()
                            3 -> eliminarSeguro()
                            4 -> listarSeguros()
                            }
                        }
                        3 -> break
                        else -> {
                            println("ERROR. Opción no válida.")
                        }
                    }
                }catch (e: NumberFormatException){
                    println("ERROR. $e")
                }
            }
        }
    }
}