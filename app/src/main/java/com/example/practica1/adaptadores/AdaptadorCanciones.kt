package com.example.practica1.adaptadores

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.practica1.clasesdatos.Cancion
import com.example.practica1.R
import com.example.practica1.actividades.Detalles
import com.example.practica1.actividades.VisorImagen



class AdaptadorCanciones(private var lista: ArrayList<Cancion>, private var contexto: Context) : RecyclerView.Adapter<AdaptadorCanciones.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vista = LayoutInflater.from(parent.context).inflate(R.layout.elemento_lista_cancion, parent, false)
        return ViewHolder(vista, contexto)

    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(lista[position])
    }

    class ViewHolder(private var vista: View, private var contexto: Context) : RecyclerView.ViewHolder(vista) {
        fun bind(cancion: Cancion) {
            vista.findViewById<ImageView>(R.id.elplvCantante).setImageResource(cancion.idImagen)
            vista.findViewById<TextView>(R.id.elpTvTitulo).text = cancion.titulo
            vista.findViewById<TextView>(R.id.elpTvGenero).text = cancion.genero
            vista.findViewById<RatingBar>(R.id.elpRbCalificacion).rating = cancion.calificacion.toFloat()

            vista.findViewById<ImageView>(R.id.elplvCantante).setOnClickListener {
                contexto.startActivity(Intent(contexto, VisorImagen::class.java).putExtra("can", cancion))
            }

            vista.setOnClickListener {
                contexto.startActivity(Intent(contexto, Detalles::class.java).putExtra("can", cancion))
            }
        }
    }

}