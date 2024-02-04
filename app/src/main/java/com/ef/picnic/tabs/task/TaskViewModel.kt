package com.ef.picnic.tabs.task

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TaskViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Экран задач пользователя"
    }
    val text: LiveData<String> = _text
}