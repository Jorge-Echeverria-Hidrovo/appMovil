package com.example.practica1.clasesdatos

import java.io.Serializable

data class  Cancion (
    var idImagen: Int,
    var titulo: String,
    var cantante: String,
    var genero: String,
    var calificacion: Double,
    var duracion: Int,
    var fecha: String
) : Serializable