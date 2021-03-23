package br.com.fiap.manipulandoimagens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var imgPerson : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgPerson = findViewById(R.id.imgPerson)
    }

    fun trocarImagem(view: View) {
        val imagem = when ( view.id ) {
            R.id.btnPerson01 -> R.drawable.person01
            R.id.btnPerson02 -> R.drawable.person02
            else -> R.drawable.person03
        }

        imgPerson.setImageResource( imagem )
    }
}