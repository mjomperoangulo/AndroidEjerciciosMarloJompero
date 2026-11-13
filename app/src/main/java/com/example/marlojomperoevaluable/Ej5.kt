package com.example.marlojomperoevaluable

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Ej5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ej5)

        var primerNumero = 0.0
        var segundoNumero = 0.0
        var operacion = ""


        val pantalla = findViewById<TextView>(R.id.tvPantalla)

        val btn0 = findViewById<Button>(R.id.btn0)
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn6 = findViewById<Button>(R.id.btn6)
        val btn7 = findViewById<Button>(R.id.btn7)
        val btn8 = findViewById<Button>(R.id.btn8)
        val btn9 = findViewById<Button>(R.id.btn9)
        val btnPunto = findViewById<Button>(R.id.btnPunto)
        val btnAC = findViewById<Button>(R.id.btnAC)
        val btnIgual = findViewById<Button>(R.id.btnIgual)
        val btnMas = findViewById<Button>(R.id.btnMas)
        val btnMenos = findViewById<Button>(R.id.btnMenos)
        val btnMultiplicacion = findViewById<Button>(R.id.btnMultiplicacion)
        val btnBarra = findViewById<Button>(R.id.btnBarra)


        btn7.setOnClickListener {
            if (pantalla.text.toString() == "0") {
                pantalla.text = "7"
            } else {
                pantalla.append("7")
            }
        }
        btn0.setOnClickListener {
            //Hace falta porque si se pone el 0 delante van a ser doble 0
            if (pantalla.text.toString() != "0") {
                pantalla.append("0")
            }

        }

        btn1.setOnClickListener {
            if (pantalla.text.toString() == "0") {
                pantalla.text = "1"
            } else {
                pantalla.append("1")
            }
        }

        btn2.setOnClickListener {
            if (pantalla.text.toString() == "0") {
                pantalla.text = "2"
            } else {
                pantalla.append("2")
            }
        }

        btn3.setOnClickListener {
            if (pantalla.text.toString() == "0") {
                pantalla.text = "3"
            } else {
                pantalla.append("3")
            }
        }

        btn4.setOnClickListener {
            if (pantalla.text.toString() == "0") {
                pantalla.text = "4"
            } else {
                pantalla.append("4")
            }
        }

        btn5.setOnClickListener {
            if (pantalla.text.toString() == "0") {
                pantalla.text = "5"
            } else {
                pantalla.append("5")
            }
        }

        btn6.setOnClickListener {
            if (pantalla.text.toString() == "0") {
                pantalla.text = "6"
            } else {
                pantalla.append("6")
            }
        }

        btn8.setOnClickListener {
            if (pantalla.text.toString() == "0") {
                pantalla.text = "8"
            } else {
                pantalla.append("8")
            }
        }

        btn9.setOnClickListener {
            if (pantalla.text.toString() == "0") {
                pantalla.text = "9"
            } else {
                pantalla.append("9")
            }
        }

        btnPunto.setOnClickListener {
            if (!pantalla.text.contains(".")) {
                pantalla.append(".")
            }
        }


        //Operaciones
        btnMas.setOnClickListener {
            primerNumero = pantalla.text.toString().toDouble()
            operacion = "+"
            pantalla.text = ""
        }

        btnMenos.setOnClickListener {
            primerNumero = pantalla.text.toString().toDouble()
            operacion = "-"
            pantalla.text = ""
        }

        btnMultiplicacion.setOnClickListener {
            primerNumero = pantalla.text.toString().toDouble()
            operacion = "*"
            pantalla.text = ""
        }

        btnAC.setOnClickListener {
            pantalla.text = "0"
            primerNumero = 0.0
            segundoNumero = 0.0
            operacion = ""
        }

        btnBarra.setOnClickListener {
            primerNumero = pantalla.text.toString().toDouble()
            operacion = "/"
            pantalla.text = ""
        }


        btnIgual.setOnClickListener {
            segundoNumero = pantalla.text.toString().toDouble()

            var resultado = 0.0

            when (operacion) {
                "+" -> resultado = primerNumero + segundoNumero
                "-" -> resultado = primerNumero - segundoNumero
                "*" -> resultado = primerNumero * segundoNumero
                //Contemplando que no se pueda dividir entre 0
                "/" -> {
                    if (segundoNumero == 0.0) {
                        pantalla.text = "No se puede dividir entre 0"
                        return@setOnClickListener //forma de salir para que no siga con operaciones
                    } else {
                        resultado = primerNumero / segundoNumero
                    }
                }
            }

            pantalla.text = resultado.toString()
        }



    }
}