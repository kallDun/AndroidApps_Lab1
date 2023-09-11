package com.example.lab1_project

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class TextFieldViewModel : ViewModel() {
    private val _state = MutableStateFlow<Int>(0)
    val state: StateFlow<Int> = _state.asStateFlow()

    fun incrementCounter() {
        _state.value = _state.value + 1
    }
}