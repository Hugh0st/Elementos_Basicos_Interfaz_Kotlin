package com.example.tareano1 // Usa tu paquete real

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// El adaptador recibe la lista y una función (lambda) para manejar los clics
class ElementosAdapter(
    private val elementos: List<String>,
    private val onItemClick: (String) -> Unit
) : RecyclerView.Adapter<ElementosAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.tvItemName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_lista, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = elementos[position]
        holder.textView.text = item
        // Al hacer clic, ejecutamos la función que nos pasaron
        holder.itemView.setOnClickListener { onItemClick(item) }
    }

    override fun getItemCount() = elementos.size
}