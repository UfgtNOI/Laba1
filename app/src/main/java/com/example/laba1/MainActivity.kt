package com.example.laba1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputField = findViewById<EditText>(R.id.inputField)
        val checkButton = findViewById<Button>(R.id.checkButton)
        val resultText = findViewById<TextView>(R.id.resultText)

        checkButton.setOnClickListener {
            val input = inputField.text.toString()

            val symbol = input[0]
            if (!symbol.isLowerCase() || !symbol.isLetter()) {
                // Проверка, что символ является строчной латинской буквой
                resultText.text = "Символ не является строчной латинской буквой"
            } else if ("aeiou".contains(symbol)) {
                // Проверка на гласные
                resultText.text = "Это гласные буквы"
            } else {
                // Остальные буквы
                resultText.text = "Возможно, это согласные буквы"
            }
        }
    }
}