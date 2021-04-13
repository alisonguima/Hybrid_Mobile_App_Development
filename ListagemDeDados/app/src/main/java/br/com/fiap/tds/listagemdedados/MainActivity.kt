package br.com.fiap.tds.listagemdedados

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var lstPaises: ListView

    val paises = arrayOf(
        "Alemanha",
        "Argélia",
        "Argentina",
        "Bélgica",
        "Brasil",
        "Bulgária",
        "Canadá",
        "Colômbia",
        "Cazaquistão",
        "Dinamarca",
        "Djibout",
        "Dominica",
        "Eslovênia",
        "Espanha",
        "Estônia",
        "Filipinas",
        "Finlândia",
        "França",
        "Georgia",
        "Grécia",
        "Guatemala",
        "Haiti",
        "Holanda",
        "Honduras",
        "Islândia",
        "Israel",
        "Itália",
        "Jamaica",
        "Japão",
        "Jordânia",
        "Kiribati",
        "Kosovo",
        "Kuwaiti",
        "Líbano",
        "Líbia",
        "Lituânia",
        "Madagascar",
        "Maldivas",
        "Marrocos",
        "Nepal",
        "Nova Zelândia",
        "Noruega",
        "Omã",
        "Paquistão",
        "Paraguai",
        "Polônia",
        "Qatar",
        "Quênia",
        "Quirguistão",
        "Romênia",
        "Ruanda",
        "Rússia",
        "Sérvia",
        "Somália",
        "Suécia",
        "Tailândia",
        "Tunísia",
        "Turquia",
        "Ucrânia",
        "Uganda",
        "Uruguai",
        "Vaticano",
        "Venezuela",
        "Vietnã",
        "Zâmbia",
        "Zimbábue"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lstPaises = findViewById(R.id.lstPaises)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, paises)

        lstPaises.adapter = adapter

        lstPaises.setOnItemClickListener { parent, view, position, id ->
            // Toast.makeText(this, paises[position], Toast.LENGTH_SHORT).show()

            val it = Intent(this, PaisActivity::class.java)
            it.putExtra("nome", paises[position])
            it.putExtra("posicao", position)

            startActivity(it)
        }
    }
}