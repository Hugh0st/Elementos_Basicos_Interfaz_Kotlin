package com.example.tareano1 // Recuerda poner tu paquete real

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.TextView
import androidx.fragment.app.Fragment

class SelectionFragment : Fragment(R.layout.fragment_selection) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cbTerminos = view.findViewById<CheckBox>(R.id.cbTerminos)
        val rgNivel = view.findViewById<RadioGroup>(R.id.rgNivel)
        val swNotificaciones = view.findViewById<Switch>(R.id.swNotificaciones)
        val tvResultado = view.findViewById<TextView>(R.id.tvResultadoSeleccion)

        // Función interna para actualizar el texto cada que algo cambia
        fun actualizarResultado() {
            val terminos = if (cbTerminos.isChecked) "Aceptados" else "Rechazados"
            val notificaciones = if (swNotificaciones.isChecked) "ON" else "OFF"

            val nivel = when (rgNivel.checkedRadioButtonId) {
                R.id.rbPrincipiante -> "Principiante"
                R.id.rbPro -> "Pro"
                else -> "Ninguno"
            }

            tvResultado.text = "Términos: $terminos\nNivel: $nivel\nNotificaciones: $notificaciones"
        }

        // Asignar los eventos (Listeners) a cada elemento
        cbTerminos.setOnCheckedChangeListener { _, _ -> actualizarResultado() }
        swNotificaciones.setOnCheckedChangeListener { _, _ -> actualizarResultado() }
        rgNivel.setOnCheckedChangeListener { _, _ -> actualizarResultado() }
    }
}