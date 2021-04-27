package com.example.calculonotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcular = calcular
        val txtresultado   = resultado

        btnCalcular.setOnClickListener {
            val txtnota1: Int = Integer.parseInt(nota1.text.toString())
            val txtnota2: Int = Integer.parseInt(nota2.text.toString())
            val media: Int = (txtnota1 + txtnota2)/2
            val txtfaltas: Int = Integer.parseInt(faltas.text.toString())
            if(txtnota1>5 && txtnota2>5) {
                if (media > 14 && txtfaltas < 11) {
                    txtresultado.setText("Aprovado com média $media ")
                    txtresultado.setTextColor(Color.BLUE)
                } else {
                    txtresultado.setText("Reprovado com média $media e $txtfaltas")
                    txtresultado.setTextColor(Color.RED)
                }
                }else{
                       txtresultado.setText("Reprovado com média $media e $txtfaltas")
                txtresultado.setTextColor(Color.RED)
                }
            }
        }
    }
