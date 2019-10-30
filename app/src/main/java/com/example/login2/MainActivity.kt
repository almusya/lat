package com.example.login2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val user = findViewById<EditText>(R.id.username)
        val pass = findViewById<EditText>(R.id.password)
        val login = findViewById<Button>(R.id.button)

        login.setOnClickListener{
            val username =user.text.toString()
            val password = pass.text.toString()

            if(username=="q" && password=="q" ){
                val intent =  Intent(this@MainActivity,second::class.java)
                intent.putExtra("username",username)
                intent.putExtra("password",password)
                startActivity(intent)
            }
            else{

                toast("Password Anda Salah",Toast.LENGTH_LONG)
            }
        }
    }
    private fun toast(pesan: String, length: Int=Toast.LENGTH_LONG) {
        Toast.makeText(this, pesan ,length).show()

    }

}
