package com.example.gallery.ui.document

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.gallery.model.Document
import com.example.gallery.utils.DataDummy

class DocumentViewModel(): ViewModel() {

    private var _dataDocument = MutableLiveData<List<Document>>()

    fun getDataDocument(): LiveData<List<Document>> {
        _dataDocument.value = DataDummy.generateDataDocument()
        return _dataDocument
    }

}