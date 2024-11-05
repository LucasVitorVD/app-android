package com.example.hello_world

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun salvar(view: android.view.View) {
        val editTextProductName = findViewById<EditText>(R.id.editTextProductName)
        val editTextProductPrice = findViewById<EditText>(R.id.editTextProductPrice)
        val checkBox = findViewById<CheckBox>(R.id.checkBoxImported)

        val productName = editTextProductName?.text.toString()
        val productPrice = editTextProductPrice?.text.toString()
        val isImported = checkBox?.isChecked

        val result = "Produto: $productName\nPreço: R$ $productPrice\nImportado: ${if (isImported == true) "Sim" else "Não"}"

        Toast.makeText(this, result, Toast.LENGTH_SHORT).show()
    }
}