package com.example.lab1_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textFieldViewModel: TextFieldViewModel by viewModels()
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                textFieldViewModel.state.collect() { value ->
                    val textField = findViewById<TextView>(R.id.main_text_field)
                    textField.text = resources.getString(R.string.modified_text, value)
                }
            }
        }

        val mainButton = findViewById<Button>(R.id.main_button)
        mainButton.setOnClickListener{
            textFieldViewModel.incrementCounter()
        }
    }
}
