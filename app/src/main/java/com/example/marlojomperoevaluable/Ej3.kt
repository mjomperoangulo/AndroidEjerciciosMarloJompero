package com.example.marlojomperoevaluable

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Ej3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ej3)


        val btnBoton1 = findViewById<Button>(R.id.btnBoton1)

        val btnBoton2 = findViewById<Button>(R.id.btnBoton2)

        val btnBoton3 = findViewById<Button>(R.id.btnBoton3)

        val btnBoton4 = findViewById<Button>(R.id.btnBoton4)


        btnBoton1.setOnClickListener {
            val intent = Intent(this, Pantalla1::class.java)
            startActivity(intent)
        }

        btnBoton2.setOnClickListener {
            val intent = Intent(this, Pantalla2::class.java)
            startActivity(intent)
        }

        btnBoton3.setOnClickListener {
            val intent = Intent(this, Pantalla3::class.java)
            startActivity(intent)
        }

        btnBoton4.setOnClickListener {
            val intent = Intent(this, Pantalla4::class.java)
            startActivity(intent)
        }



    }
}