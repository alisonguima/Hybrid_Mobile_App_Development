package br.com.fiap.cp01.rm82665_rm84601_rm85163

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var imgGaleria: ImageView
    var contador = 0
    val imgs = intArrayOf(
        R.drawable.p0,
        R.drawable.p1,
        R.drawable.p2,
        R.drawable.p3,
        R.drawable.p4,
        R.drawable.p5,
        R.drawable.p6
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgGaleria = findViewById(R.id.imgGaleria)
    }


    fun trocaImg(index: Int){
        if (contador == -1){
            contador = 6}
        else if (contador == 7){
            contador = 0
        }
        imgGaleria.setImageResource(imgs[contador])
        Toast.makeText(this,"Imagem ${contador + 1}", Toast.LENGTH_SHORT).show()
    }
    fun voltar(view: View){
        contador--
        trocaImg(contador)
    }
    fun avancar(view: View){
        contador++
        trocaImg(contador)
    }
}