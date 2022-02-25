package com.example.oneplusoneapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var CuadroTexto: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CuadroTexto = findViewById<TextView>(R.id.Resultado)

        val parametro1: EditText = findViewById<EditText>(R.id.input1)
        val parametro2: EditText = findViewById<EditText>(R.id.input2)
        val parametro3: EditText = findViewById<EditText>(R.id.input3)

        val botonLimpiar: Button = findViewById<Button>(R.id.buttonClear)
        val botonAgregar: Button = findViewById<Button>(R.id.buttonAdd)

        botonAgregar.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                if (parametro1.text.toString()!="" && parametro2.text.toString()!="" && parametro3.text.toString()!=""){
                    if (CuadroTexto?.text != "") {
                        CuadroTexto?.append("\n")
                    }
                    CuadroTexto?.append(parametro1.text)
                    CuadroTexto?.append("+")
                    CuadroTexto?.append(parametro2.text)
                    CuadroTexto?.append("=")
                    CuadroTexto?.append(parametro3.text)
                    parametro1.setText("")
                    parametro2.setText("")
                    parametro3.setText("")
                }
            }
        })
        botonLimpiar.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                parametro1.setText("")
                parametro2.setText("")
                parametro3.setText("")
                CuadroTexto?.text = ""
            }
        })
    }
}