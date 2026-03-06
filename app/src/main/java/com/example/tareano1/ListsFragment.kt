package com.example.tareano1 // Usa tu paquete real

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListsFragment : Fragment(R.layout.fragment_lists) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rvElementos = view.findViewById<RecyclerView>(R.id.rvElementos)

        // Datos de ejemplo
        val listaDatos = listOf(
            "Android Studio",
            "Kotlin",
            "RecyclerView",
            "Intents",
            "Fragments",
            "ConstraintLayout"
        )

        rvElementos.layoutManager = LinearLayoutManager(requireContext())

        // Configuramos el adaptador y le decimos qué hacer al hacer clic
        rvElementos.adapter = ElementosAdapter(listaDatos) { elementoSeleccionado ->
            // Viajamos a DetailActivity y le pasamos el nombre del elemento
            val intent = Intent(requireContext(), DetailActivity::class.java)
            intent.putExtra("NOMBRE_ELEMENTO", elementoSeleccionado)
            startActivity(intent)
        }
    }
}