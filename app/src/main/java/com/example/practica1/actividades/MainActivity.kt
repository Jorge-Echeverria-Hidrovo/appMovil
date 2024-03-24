package com.example.practica1.actividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practica1.adaptadores.AdaptadorCanciones
import com.example.practica1.clasesdatos.Cancion
import com.example.practica1.R
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val amRvCanciones: RecyclerView = findViewById(R.id.amRvCanciones)

        amRvCanciones.layoutManager = LinearLayoutManager(this)
        amRvCanciones.adapter = AdaptadorCanciones(generarDatosPrueba(), this)

    }

    private fun generarDatosPrueba() : ArrayList<Cancion>{
        val lista = ArrayList<Cancion>()
        lista.add(Cancion(R.drawable.juanes, "A Dios Le Pido", "Juanes", "Pop", 4.3, 169, "2014"))
        lista.add(Cancion(R.drawable.shakira, "Hips Don't Lie", "Shakira", "Pop", 4.0, 113, "2017"))
        lista.add(Cancion(R.drawable.diego_torres, "Color Esperanza", "Diego Torres", "Romantica", 3.95, 116, "2016"))
        lista.add(Cancion(R.drawable.los_fabulosos_cadillacs, "Matador", "Los Fabulosos Cadillacs", "Rock", 3.85, 108, "2015"))
        lista.add(Cancion(R.drawable.celia_cruz, "Guantanamera", "Celia Cruz", "Salsa", 3.5, 119, "2017"))
        lista.add(Cancion(R.drawable.calle_13, "Latinoamérica", "Calle 13", "Pop", 4.3, 169, "2014"))
        lista.add(Cancion(R.drawable.carlos_vives, "La Bicicleta", "Carlos Vives", "Pop", 4.0, 113, "2017"))
        lista.add(Cancion(R.drawable.consuelo_velazquez, "Bésame", "Consuelo Velazquez", "Romantica", 3.95, 116, "2016"))
        lista.add(Cancion(R.drawable.franco_de_vita, "No basta", "Franco de Vita", "Rock", 3.85, 108, "2015"))
        lista.add(Cancion(R.drawable.ricky_martin, "Tu recuerdo", "Ricky Martin", "Salsa", 3.5, 119, "2017"))

        return lista
    }

}
