package com.example.myapp
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {
    private lateinit var share1summ: EditText
    private lateinit var share2summ: EditText
    private lateinit var share3summ: EditText
    private lateinit var balanceTextView: TextView
    private lateinit var updateButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val username = intent.getStringExtra("userName")
        share1summ = findViewById(R.id.share1summ)
        share2summ = findViewById(R.id.share2summ)
        share3summ = findViewById(R.id.share3summ)
        balanceTextView = findViewById(R.id.balanceTextView)
        updateButton = findViewById(R.id.updateButton)
        val userDataTextView = findViewById<TextView>(R.id.userDataTextView)
        userDataTextView.text = "Имя пользователя: $username"
        val sum = 0
        balanceTextView.text = "Сумма кошелька: $sum"
        updateButton.setOnClickListener {
            val share1Value = share1summ.text.toString().toDoubleOrNull() ?: 0.0
            val share2Value = share2summ.text.toString().toDoubleOrNull() ?: 0.0
            val share3Value = share3summ.text.toString().toDoubleOrNull() ?: 0.0

            val sum = share1Value + share2Value + share3Value

            balanceTextView.text = "Сумма кошелька: $sum"

        }
    }
}
