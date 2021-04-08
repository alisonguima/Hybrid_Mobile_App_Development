package br.com.fiap.nac01.checkboxeradiobuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var chkSandubaGigante : CheckBox
    lateinit var chkOmelete : CheckBox
    lateinit var chkHamburguer : CheckBox
    lateinit var chkHotDog : CheckBox
    lateinit var chkBeirute : CheckBox
    lateinit var chkEsfiha : CheckBox
    lateinit var chkXTudao : CheckBox
    lateinit var chkVegano : CheckBox

    lateinit var rdgOpcoesPagamento : RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        chkSandubaGigante = findViewById(R.id.chkSandubaGigante)
        chkOmelete = findViewById(R.id.chkOmelete)
        chkHamburguer = findViewById(R.id.chkHamburguer)
        chkHotDog = findViewById(R.id.chkHotDog)
        chkBeirute = findViewById(R.id.chkBeirute)
        chkEsfiha = findViewById(R.id.chkEsfiha)
        chkXTudao = findViewById(R.id.chkXTudao)
        chkVegano = findViewById(R.id.chkVegano)

        rdgOpcoesPagamento = findViewById(R.id.rdgOpcoesPagamento)
    }

    fun fazerPedido(view: View) {
        var total = 0.0

        if (chkSandubaGigante.isChecked){
            total += 10
        }

        if (chkOmelete.isChecked){
            total += 11
        }

        if (chkHamburguer.isChecked){
            total += 12
        }

        if (chkHotDog.isChecked){
            total += 13
        }

        if (chkBeirute.isChecked){
            total += 14
        }

        if (chkEsfiha.isChecked){
            total += 15
        }

        if (chkXTudao.isChecked){
            total += 16
        }

        if (chkVegano.isChecked){
            total += 17
        }

        val opcaoPagamento = rdgOpcoesPagamento.checkedRadioButtonId

        if (opcaoPagamento == -1){
            Toast.makeText(this, getString(R.string.informe_pagamento), Toast.LENGTH_SHORT).show()
            return
        }

        if (opcaoPagamento != R.id.rdbCartaoDeCredito){
            total *= 85;
        }

        val msg =String.format("%s: R$ %.2f", getString(R.string.total), total)

        Toast.makeText(this, "${msg}: R$ ${total}", Toast.LENGTH_SHORT).show()
    }
}