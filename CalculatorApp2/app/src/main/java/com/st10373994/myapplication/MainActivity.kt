package com.st10373994.myapplication



import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById<EditText>(R.id.num1)
        val num2 = findViewById<EditText>(R.id.num2)
        val addButton = findViewById<Button>(R.id.addButton)
        val resultText = findViewById<TextView>(R.id.resultText)

        addButton.setOnClickListener {
            val number1 = num1.text.toString().toDoubleOrNull()
            val number2 = num2.text.toString().toDoubleOrNull()

            if (number1 != null && number2 != null) {
                val sum = number1 + number2
                resultText.text = "Result: $sum"
            } else {
                resultText.text = "Please enter valid numbers"
            }
        }
    }
}
