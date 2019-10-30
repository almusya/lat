package com.example.login2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.dasboard.*

class dasboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dasboard)

        val intent = intent
        val user = intent.getStringExtra("username")
        val pass = intent.getStringExtra("password")

        val text = findViewById<TextView>(R.id.textView)
        text.text="Username :"+user+"\nPassword :"+pass

    }
}