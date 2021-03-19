package br.com.fiap.calculadorafiap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    lateinit var edtNumero01 : EditText
    lateinit var edtNumero02 : EditText
    lateinit var txtResultado : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtNumero01 = findViewById(R.id.edtNumero01)
        edtNumero02 = findViewById(R.id.edtNumero02)
        txtResultado = findViewById(R.id.txtResultado)
    }

    fun validarNumero(strNumero : String)  : Boolean {
        if (strNumero.trim().isEmpty()){
            Toast.makeText(this, "Informe corretamente os números no formulário!", Toast.LENGTH_SHORT).show()
            return false
        }
        return true
    }

    fun validar (strNumero1: String, strNumero2: String) : Boolean{
        return validarNumero(strNumero1) && validarNumero(strNumero2)
    }

    fun somar(view: View) {
        val strNumero01 = edtNumero01.text.toString()
        val strNumero02 = edtNumero02.text.toString()

        if (!validar(strNumero01, strNumero02)){
            return
        }
        
        try {
            val numero01 = strNumero01.toInt()
            val numero02 = strNumero02.toInt()

            val soma = numero01 + numero02

            txtResultado.text = "A soma atual é: ${soma}"
        } catch ( e : Exception){
            Toast.makeText(this, "Não foi possível realizar a soma com os dados informados", Toast.LENGTH_SHORT).show()
        }
    }
}