package com.example.lab2_project.ui.custom

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CustomViewModel : ViewModel()  {
    private val _text = MutableLiveData<String>().apply {
        value = "This is custom Fragment"
    }
    val text: LiveData<String> = _text
}