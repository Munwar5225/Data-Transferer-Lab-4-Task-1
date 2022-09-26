package com.example.datacarier

import android.app.ActionBar
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Second_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val getMessage:TextView = findViewById(R.id.getmessage)
        val intent: Intent = intent
        getMessage.text = intent.getStringExtra("message")
        supportActionBar?.hide()

    }
}