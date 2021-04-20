package br.com.fiap.tds.cp02.rm4601

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    lateinit var rdgMateriais : RadioGroup
    lateinit var edtMetrosQuadrados : EditText
    lateinit var chkFrete : CheckBox
    lateinit var txtResultado : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rdgMateriais = findViewById(R.id.rdgMateriais)
        edtMetrosQuadrados = findViewById(R.id.edtMetrosQuadrados)
        chkFrete = findViewById(R.id.chkFrete)
        txtResultado = findViewById(R.id.txtResultado)
    }

    /**
     * Evento disparado pelo botão calcular
     */

    fun calcular(view: View) {
        val strMetrosQuadrados = edtMetrosQuadrados.text.toString().trim()

        if (strMetrosQuadrados.isNullOrEmpty()){
            toast(getString(R.string.medidaNaoPreenchida))
            return
        }

        try {
            val metrosQuadrados = strMetrosQuadrados.toDouble()

            if (metrosQuadrados <= 0){
                toast(getString(R.string.medidaNegativa))
                return
            }

            var total = when (rdgMateriais.checkedRadioButtonId){
                R.id.rdbPisoBranco -> 24.9
                R.id.rdbPisoAlbania -> 11.9
                R.id.rdbPorcelanatoPolato -> 39.9
                R.id.rdbRevestimentoMosaico -> 19.9
                else -> 0.0
            }

            total *= metrosQuadrados

            if (chkFrete.isChecked){
                total *= 1.3
            }

            txtResultado.text = String.format("R$ %.2f", total)
        } catch (e : Exception) {
            toast("${getString(R.string.ocorreuErro)} ${e.message}")
        }

    }

    /**
     * Padroniza um toast para esse app
     */
    fun toast (msg: String){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}