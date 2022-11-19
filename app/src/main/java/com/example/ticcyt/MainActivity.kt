package com.example.ticcyt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var startBut: Button
    private lateinit var player1: EditText
    private lateinit var player2: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startBut = findViewById(R.id.button10)
        player1 = findViewById(R.id.editTextTextPersonName)
        player2 = findViewById(R.id.editTextTextPersonName2)

        startBut.setOnClickListener {
            val playerr1 = player1.text.toString()
            val playerr2 = player2.text.toString()
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("NAME", playerr1)
            intent.putExtra("NAMEE", playerr2)
            startActivity(intent)
        }
    }
}