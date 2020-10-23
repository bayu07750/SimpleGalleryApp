package com.example.gallery.ui.image

import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gallery.databinding.ItemContainerBinding
import com.example.gallery.model.Image

class ImageContainerViewHolder(private val binding: ItemContainerBinding) : RecyclerView.ViewHolder(binding.root) {

    private val mAdapter: ImageAdapter = ImageAdapter()

    fun bind(image: Image) {
        binding.textDate.text = image.date

        setRecyclerView()
        image.listImage?.let { mAdapter.setData(it) }
    }

    private fun setRecyclerView() {
        with (binding.recyclerView) {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(itemView.context, 3, RecyclerView.VERTICAL, false)
            adapter = mAdapter
        }
    }
}