package com.example.lab2_project.ui.main

import androidx.lifecycle.*

class PageViewModel : ViewModel() {

    private val _index = MutableLiveData<Int>()
    val text: LiveData<String> = _index.map { input: Int? ->
        "Hello world from section: $input"
    }

    fun setIndex(index: Int) {
        _index.value = index
    }
}