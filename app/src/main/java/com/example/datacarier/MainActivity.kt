package com.example.datacarier

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val message : EditText = findViewById(R.id.getmessage)
        val button : Button = findViewById(R.id.button)
        button.setOnClickListener {
            if(message.text.toString().isEmpty()){
                Toast.makeText(this, "Please type your message", Toast.LENGTH_LONG).show()
            }

            else
            {
                val intent  = Intent(applicationContext, Second_Activity::class.java)
                intent.putExtra("message" , message.text.toString())
                startActivity(intent)
                finish()
            }
        }

    }
}