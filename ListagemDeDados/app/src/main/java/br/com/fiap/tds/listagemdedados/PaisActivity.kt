package br.com.fiap.tds.listagemdedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PaisActivity : AppCompatActivity() {

    lateinit var txtInfoPais : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pais)

        txtInfoPais = findViewById(R.id.textInfoPais)

        val extras = this.intent.extras

        if ( extras != null){
            val nome = extras.getString("nome", "")
            val posicao = extras.getInt("posicao", -1)

            txtInfoPais.text = "${nome} - Posicao: ${posicao}"

            this.title = nome
        }
    }
}