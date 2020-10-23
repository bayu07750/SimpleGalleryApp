package com.example.gallery.ui.image

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gallery.databinding.ItemContainerBinding
import com.example.gallery.model.Image

class ImageContainerAdapter : RecyclerView.Adapter<ImageContainerViewHolder>() {

    private var list = emptyList<Image>()

    fun submitList(list: List<Image>) {
        this.list = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageContainerViewHolder {
        return ImageContainerViewHolder(
                ItemContainerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ImageContainerViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}
