package com.example.marlojomperoevaluable

import android.app.PendingIntent
import android.content.Intent
import android.os.Bundle
import android.os.Looper
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.os.Handler

class Ej2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ej2)

        val btnAbrir = findViewById<Button>(R.id.btnAbrir)

        btnAbrir.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java) //Navegacion preparada

            val pendingIntent = PendingIntent.getActivity(
                this, //Ej2
                0, // Codigo identificador
                intent,
                PendingIntent.FLAG_IMMUTABLE //No podra ser modificado por quien lo reciba
            )


            val handler = Handler(Looper.getMainLooper())
            //Handler preparar acciones para que se ejecuten despues de ahi "handler"
            "Looper.. gestiona cuando se usan y en este caso coge el principal"

            handler.postDelayed({ //programa una accion para ejecutarla con un delay
                pendingIntent.send() // Accion que se ejecuta despues de los 10s
            },10000)


        }





    }
}