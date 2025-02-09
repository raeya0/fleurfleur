package com.example.fleurhaven

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Activity_Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        val signUpText = findViewById<TextView>(R.id.signupText)

        signUpText.setOnClickListener {
            val intent = Intent(this, Activity_SignUp::class.java)
            startActivity(intent)
        }



    }
}
