package br.com.fiap.palindromos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import java.text.Normalizer
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {

    lateinit var edtFrase : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtFrase = findViewById(R.id.edtFrase)
    }

    /**
     * Evento disparado pelo botão de verificar a frase
     *
     * @param view
     */
    fun verificar(view: View) {
        var txt = edtFrase.text.toString().trim().toLowerCase()

        if ( txt.length < 3 ) {
            toast(getString(R.string.informe_uma_frase))
            return
        }

        txt = removerCaracteresEspeciais(txt)

        val frase = if ( txt.equals( txt.reversed() ) ) {
            getString(R.string.eh_palindromo)
        } else {
            getString(R.string.nao_eh_palindromo)
        }

        toast(frase)
    }

    /**
     * Toast padronizado
     *
     * @param frase
     */
    fun toast(frase : String) {
        Toast.makeText(this, frase, Toast.LENGTH_SHORT).show()
    }


    /**
     * Remove caracteres especiais e converte acentuação para caracteres ASCII
     *
     * @param txt
     * @return String
     */
    fun removerCaracteresEspeciais( txt : String ) : String {
        var temp = Normalizer.normalize(txt, Normalizer.Form.NFD)
        val pattern = Pattern.compile("\\p{InCOMBINING_DIACRITICAL_MARKS}+")

        var txt = pattern.matcher(temp).replaceAll("")

        val regex = "[^a-z]".toRegex()
        return regex.replace(txt, "")
    }
}