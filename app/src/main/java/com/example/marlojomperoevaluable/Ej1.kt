package com.example.marlojomperoevaluable

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Ej1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ej1)

        val etUrl = findViewById<EditText>(R.id.etUrl)
        val btnAbrir = findViewById<Button>(R.id.btnAbrir)

        btnAbrir.setOnClickListener {

            val url = etUrl.text.toString()

            if (url.isEmpty() || !Patterns.WEB_URL.matcher(url).matches()) {

                Toast.makeText(this, "Introduce una URL válida", Toast.LENGTH_SHORT).show()

            } else {

                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(intent)

            }
        }
    }
}