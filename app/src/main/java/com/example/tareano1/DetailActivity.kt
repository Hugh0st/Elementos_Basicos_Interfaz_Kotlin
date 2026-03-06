package com.example.tareano1 // Usa tu paquete real

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvElemento = findViewById<TextView>(R.id.tvElementoSeleccionado)

        // Recibimos el dato que nos mandó el Fragment
        val datoRecibido = intent.getStringExtra("NOMBRE_ELEMENTO")
        tvElemento.text = datoRecibido
    }
}