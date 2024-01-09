package com.example.myapp
import android.widget.EditText
import android.widget.Button
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var userNameEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userNameEditText = findViewById(R.id.usernameEditText)

        val startButton = findViewById<Button>(R.id.startButton)
        startButton.setOnClickListener {
            saveUserDataAndNavigateToSecondActivity()
        }
    }

    private fun saveUserDataAndNavigateToSecondActivity() {
        val userName = userNameEditText.text.toString()

        if (userName.isNotEmpty()) {
            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra("userName", userName)
            }
            startActivity(intent)
        } else {
            Toast.makeText(this, "Проверьте правильность заполнения всех полей", Toast.LENGTH_SHORT).show()
        }
    }


}