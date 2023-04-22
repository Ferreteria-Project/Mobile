package com.example.mobileferreteria

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var btnregisR: Button

class Registrarse : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrarse)

        btnregisR = findViewById(R.id.btnRegistrarseR)

        btnregisR.setOnClickListener{
            val open: Intent = Intent (this, LogIn::class.java)
            startActivity(open)
        }

    }
}