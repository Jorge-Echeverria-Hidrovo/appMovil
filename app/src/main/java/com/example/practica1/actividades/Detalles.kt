package com.example.practica1.actividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practica1.clasesdatos.Cancion
import com.example.practica1.R
import android.content.Intent.*
import android.widget.TextView


class Detalles : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalles)

        val cancion = intent.getSerializableExtra("can") as Cancion

        val adTvTitulo = findViewById<TextView>(R.id.adTvTitulo)
        val adTvCantante = findViewById<TextView>(R.id.adTvCantante)
        val adTvGenero = findViewById<TextView>(R.id.adTvGenero)
        val adTvCalificacion = findViewById<TextView>(R.id.adTvCalificacion)
        val adTvDuracion = findViewById<TextView>(R.id.adTvDuracion)
        val adTvFecha = findViewById<TextView>(R.id.adTvFecha)

        adTvTitulo.text = getString(R.string.titulo, cancion.titulo)
        adTvCantante.text = getString(R.string.cantante, cancion.cantante)
        adTvGenero.text = getString(R.string.genero, cancion.genero)
        adTvCalificacion.text = getString(R.string.calificacion, cancion.calificacion.toString())
        adTvDuracion.text = getString(R.string.duracion, cancion.duracion.toString())
        adTvFecha.text = getString(R.string.fecha, cancion.fecha)

    }
}
