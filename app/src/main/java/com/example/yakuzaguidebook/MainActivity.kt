package com.example.yakuzaguidebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClickOnInfo(view: View) {
        val intent: Intent = Intent(this,InfoActivity::class.java)
        startActivity(intent)
    }

    fun buttonClickExit(view: View) {
        super.onBackPressed()
    }

    fun buttonClickToCharacter(view: View) {
        val intent: Intent = Intent(this,CharacterActivity::class.java)
        startActivity(intent)
    }
}