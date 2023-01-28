package com.example.yakuzaguidebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class CharacterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character)
    }

    fun buttonTextSwapKiryu(view: View) {
        val textSwapKir:TextView = findViewById(R.id.textViewLore)
        textSwapKir.setText(R.string.character_kazuma)
    }

    fun buttonTextSwapMajima(view: View) {
        val textSwapKir:TextView = findViewById(R.id.textViewLore)
        textSwapKir.setText(R.string.character_majima)
    }

    fun buttonClickBackToMain(view: View) {
        val intent: Intent = Intent(this,MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intent)
    }
}