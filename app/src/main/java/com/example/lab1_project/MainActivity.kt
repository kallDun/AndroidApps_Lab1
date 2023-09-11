package com.example.lab1_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var clickedCounter : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textField = findViewById<TextView>(R.id.main_text_field)
        val mainButton = findViewById<Button>(R.id.main_button)
        mainButton.setOnClickListener{
            clickedCounter++
            textField.text = resources.getString(R.string.modified_text, clickedCounter)
        }
    }
}
