package com.my.first.notasapp_sqlite

import android.content.Context
import android.view.View
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class NotasAdaptador (
    private var notas : List<Nota>,
    context: Context) : RecyclerView.Adapter<NotasAdaptador.NotaViewHolder>{

    class NotaViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val itemTitulo : TextView = itemView.findViewById(R.id.item_titulo)
        val itemDescripcion : TextView = itemView.find
    }
}