package com.example.marlojomperoevaluable

import android.annotation.SuppressLint
import android.app.PendingIntent
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

import kotlin.jvm.*


class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnEj1 = findViewById<Button>(R.id.btnEj1)
        val btnEj2 = findViewById<Button>(R.id.btnEj2)
        val btnEj3 = findViewById<Button>(R.id.btnEj3)
        val btnEj4 = findViewById<Button>(R.id.btnEj4)
        val btnEj5 = findViewById<Button>(R.id.btnEj5)
        val btnEj6 = findViewById<Button>(R.id.btnEj6)

        btnEj1.setOnClickListener {
            val intent = Intent(this, Ej1::class.java)
            startActivity(intent)
        }

        btnEj2.setOnClickListener {
            val intent = Intent(this, Ej2::class.java)
            startActivity(intent)
        }

        btnEj3.setOnClickListener {
            val intent = Intent(this, Ej3::class.java)
            startActivity(intent)
        }

        btnEj4.setOnClickListener {
            val intent = Intent(this, Ej4::class.java)
            startActivity(intent)
        }

        btnEj5.setOnClickListener {
            val intent = Intent(this, Ej5::class.java)
            startActivity(intent)
        }

        btnEj6.setOnClickListener {
            val intent = Intent(this, Ej6::class.java)
            startActivity(intent)
        }







    }
}


