package com.example.gallery.ui.document

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gallery.databinding.ItemContainerBinding
import com.example.gallery.model.Document

class DocumentContainerViewHolder(private val binding: ItemContainerBinding): RecyclerView.ViewHolder(binding.root) {

    private val mAdapter = DocumentAdapter()

    fun bind(document: Document) {
        binding.textDate.text = document.date

        setRecyclerView()
        document.titles?.let { mAdapter.submitData(it) }
    }

    private fun setRecyclerView() {
        with (binding.recyclerView) {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(itemView.context)
            adapter = mAdapter
        }
    }

}