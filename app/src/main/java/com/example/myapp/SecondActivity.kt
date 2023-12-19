package com.example.myapp
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

// В SecondActivity.kt
class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val username = intent.getStringExtra("userName")
        val balance = intent.getFloatExtra("walletAmount", 0f)

        val userDataTextView = findViewById<TextView>(R.id.userDataTextView)
        val balanceTextView = findViewById<TextView>(R.id.balanceTextView)
        userDataTextView.text = "Имя пользователя: $username"
        balanceTextView.text = "Сумма кошелька: $balance"

    }

    
}