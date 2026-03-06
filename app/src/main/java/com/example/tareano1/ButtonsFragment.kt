package com.example.tareano1 // Usa tu paquete real

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ButtonsFragment : Fragment(R.layout.fragment_buttons) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnNormal = view.findViewById<Button>(R.id.btnNormal)
        val btnImagen = view.findViewById<ImageButton>(R.id.btnImagen)
        val fabAction = view.findViewById<FloatingActionButton>(R.id.fabAction)

        btnNormal.setOnClickListener {
            Toast.makeText(requireContext(), "¡Botón normal presionado!", Toast.LENGTH_SHORT).show()
        }

        btnImagen.setOnClickListener {
            Toast.makeText(requireContext(), "¡Clic en la imagen (ImageButton)!", Toast.LENGTH_SHORT).show()
        }

        fabAction.setOnClickListener {
            Toast.makeText(requireContext(), "¡Acción flotante (FAB) activada!", Toast.LENGTH_SHORT).show()
        }
    }
}