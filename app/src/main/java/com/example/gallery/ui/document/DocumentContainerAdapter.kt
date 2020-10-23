package com.example.gallery.ui.document

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gallery.databinding.ItemContainerBinding
import com.example.gallery.model.Document

class DocumentContainerAdapter() : RecyclerView.Adapter<DocumentContainerViewHolder>() {

    private var list = emptyList<Document>()

    fun submitList(list: List<Document>) {
        this.list = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DocumentContainerViewHolder {
        return DocumentContainerViewHolder(
                ItemContainerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: DocumentContainerViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

}