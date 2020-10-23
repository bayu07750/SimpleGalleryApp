package com.example.gallery.ui.image

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.gallery.model.Image
import com.example.gallery.utils.DataDummy

class ImageViewModel : ViewModel() {

    private val _dataImage = MutableLiveData<List<Image>>()

    fun getDataImage(): LiveData<List<Image>> {
        _dataImage.value = DataDummy.generateDataImage2()
        return _dataImage
    }

}