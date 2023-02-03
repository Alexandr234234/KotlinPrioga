package com.example.quizandroid

import android.content.Intent
import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val btnExit = findViewById<Button>(R.id.button2)
        val btnStart = findViewById<Button>(R.id.button)

        btnExit.setOnClickListener(this::exitApp)
        btnStart.setOnClickListener(this::startNew)
    }
    fun startNew(view: View){
        val intent = Intent(this, secondActivity::class.java)
        startActivity(intent)
    }

    fun exitApp(view: View) {
        finish()
    }
}