package com.example.tareano1 // Pon el nombre de tu paquete real

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.fragment.app.Fragment

class InfoFragment : Fragment(R.layout.fragment_info) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val ivMuestra = view.findViewById<ImageView>(R.id.ivMuestra)
        val progressBar = view.findViewById<ProgressBar>(R.id.progressBar)
        val btnSimularCarga = view.findViewById<Button>(R.id.btnSimularCarga)

        btnSimularCarga.setOnClickListener {
            // Mostramos el ProgressBar y bloqueamos el botón
            progressBar.visibility = View.VISIBLE
            ivMuestra.alpha = 0.3f // Hacemos la imagen semi-transparente
            btnSimularCarga.isEnabled = false
            btnSimularCarga.text = "Cargando..."

            // Usamos postDelayed para simular una espera de 2 segundos (2000 ms)
            ivMuestra.postDelayed({
                progressBar.visibility = View.INVISIBLE
                ivMuestra.alpha = 1.0f
                ivMuestra.setImageResource(android.R.drawable.ic_menu_camera) // Cambiamos la foto
                btnSimularCarga.isEnabled = true
                btnSimularCarga.text = "¡Carga completada!"
            }, 2000)
        }
    }
}