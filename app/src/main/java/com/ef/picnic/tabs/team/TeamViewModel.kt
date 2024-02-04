package com.ef.picnic.tabs.team

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TeamViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Экран команд в которых состоит пользователь"
    }
    val text: LiveData<String> = _text
}