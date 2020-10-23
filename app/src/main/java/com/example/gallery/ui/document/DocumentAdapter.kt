package com.example.gallery.ui.document

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gallery.databinding.ItemDocumentBinding

class DocumentAdapter : RecyclerView.Adapter<DocumentAdapter.DocumentViewHolder>() {

    private var list = emptyList<String>()

    fun submitData(list: List<String>) {
        this.list = list
        notifyDataSetChanged()
    }

    class DocumentViewHolder(val binding: ItemDocumentBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(title: String) {
            binding.title.text = title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DocumentViewHolder {
        return DocumentViewHolder(
                ItemDocumentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: DocumentViewHolder, position: Int) {
        val lastIndex = list.size - 1
        if (position == lastIndex) {
            holder.binding.line.visibility = View.GONE
        }
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}