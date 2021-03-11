package br.com.fiap.transicaojavaparakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var nome : String? = null
    val contador : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var pessoa : Pessoa = Pessoa("Cabral", "alisonguimaraes17@gmail.com")
        var pessoaJava = PessoaJava("Douglas", "teste828@asc.com")

    }

    fun soma(a:Int, b:Int):Int {
        return a + b
    }
}

class Pessoa(var nome:String, val email:String)