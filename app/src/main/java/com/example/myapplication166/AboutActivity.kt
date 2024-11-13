package com.example.myapplication166

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val aboutTextView = findViewById<TextView>(R.id.textView) // Use the correct ID

        // Get the intent extras
        val aboutText = intent.getStringExtra("aboutText")

        // Set the text in the TextView
        if (aboutText != null) {
            aboutTextView.text = aboutText
        } else {
            aboutTextView.text = "Информация о программе:\n\n" +
                    "Это приложение позволяет изменять тему приложения.\n" +
                    "Вы также можете просмотреть информацию \"О программе\"."
        }
    }
    }
