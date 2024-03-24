package com.example.practica1.actividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.practica1.clasesdatos.Cancion
import com.example.practica1.R



class VisorImagen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visor_imagen)

        val cancion = intent.getSerializableExtra("can") as Cancion

        val aviIvCancion = findViewById<ImageView>(R.id.aviIvCancion)

        aviIvCancion.setImageResource(cancion.idImagen)
    }
}
