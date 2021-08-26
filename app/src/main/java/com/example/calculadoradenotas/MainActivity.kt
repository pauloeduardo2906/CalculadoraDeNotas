package com.example.calculadoradenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btCalcular = btn_calcular
        val aprovado = txt_resultado_aprovado
        val numNota = txt_resultado_nota
        val numFalta = txt_resultado_falta

        btCalcular.setOnClickListener {
            val nota1 = Integer.parseInt(et_nota1.text.toString())
            val nota2 = Integer.parseInt(et_nota2.text.toString())
            val media = (nota1 + nota2)/2
            val falta = Integer.parseInt(et_faltas.text.toString())

            if(media >= 6 && falta <= 10){
                aprovado.setText("ALUNO APROVADO!!!")
                numNota.setText("Nota Final: "+media)
                numFalta.setText("Faltas: "+falta)

                aprovado.setTextColor(Color.GREEN)
                numNota.setTextColor(Color.GREEN)
                numFalta.setTextColor(Color.GREEN)



            }else{
                aprovado.setText("ALUNO REPROVADO!!!")
                numNota.setText("Nota Final: "+media)
                numFalta.setText("Faltas: "+falta)

                aprovado.setTextColor(Color.RED)
                numNota.setTextColor(Color.RED)
                numFalta.setTextColor(Color.RED)

            }
        }
    }
}


