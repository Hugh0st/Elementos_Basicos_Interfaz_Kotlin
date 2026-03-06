package com.example.tareano1 // Usa tu paquete real

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.android.material.textfield.TextInputEditText

class TextFieldsFragment : Fragment(R.layout.fragment_text_fields) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val etNombre = view.findViewById<TextInputEditText>(R.id.etNombre)
        val etPassword = view.findViewById<TextInputEditText>(R.id.etPassword)
        val btnLeerTexto = view.findViewById<Button>(R.id.btnLeerTexto)
        val tvResultado = view.findViewById<TextView>(R.id.tvResultadoTexto)

        btnLeerTexto.setOnClickListener {
            val nombre = etNombre.text.toString()
            val password = etPassword.text.toString()

            if (nombre.isNotBlank() || password.isNotBlank()) {
                tvResultado.text = "Hola $nombre. Tu contraseña tiene ${password.length} caracteres."
            } else {
                tvResultado.text = "Por favor, escribe algo en los campos."
            }
        }
    }
}