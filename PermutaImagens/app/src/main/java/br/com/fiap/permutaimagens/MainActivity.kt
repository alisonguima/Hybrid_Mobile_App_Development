package br.com.fiap.permutaimagens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var imgShape01 : ImageView
    lateinit var imgShape02 : ImageView

    var inverter = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgShape01 = findViewById(R.id.imgShape01)
        imgShape02 = findViewById(R.id.imgShape02)
    }

    fun trocarImagem(view: View) {

        inverter = !inverter

        val img01 = if (inverter) R.drawable.triangulo else R.drawable.quadrado
        var img02 = if (inverter) R.drawable.quadrado else R.drawable.triangulo
    }
}