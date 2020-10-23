package com.example.gallery.utils

import com.example.gallery.R
import com.example.gallery.model.Document
import com.example.gallery.model.Image

object DataDummy {

    private var listImage1 = listOf(
            R.drawable.img1,
            R.drawable.img2
    )

    private var listImage2 = listOf(
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6,
            R.drawable.img7,
            R.drawable.img8,
            R.drawable.img9,
            R.drawable.img10,
            R.drawable.img11,
            R.drawable.img12
    )

    private var listImage3 = listOf(
            R.drawable.img5,
            R.drawable.img6,
            R.drawable.img1
    )

    fun generateDataImage2(): List<Image> {
        return listOf(
                Image(date = "29 july 2020", listImage = listImage1),
                Image(date = "21 July 2020", listImage = listImage2),
                Image(date = "19 July 2020", listImage = listImage3)
        )
    }

    private var listTitles1 = listOf("tugas-essay.dock", "tabel-matrix.xlsx")
    private var listTitles2 = listOf("tugas-essay.dock", "tabel-matrix.xlsx", "file.txt", "table.db", "man.ai", "project.kt")

    fun generateDataDocument(): List<Document> {
        return listOf(
                Document(date = "29 July 2020", titles = listTitles1),
                Document(date = "30 July 2020", titles = listTitles2)
        )
    }
}