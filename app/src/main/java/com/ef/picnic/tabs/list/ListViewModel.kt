package com.ef.picnic.tabs.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ListViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Экран списков продуктов и вещей"
    }
    val text: LiveData<String> = _text
}