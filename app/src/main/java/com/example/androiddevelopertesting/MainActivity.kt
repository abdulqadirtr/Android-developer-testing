package com.example.androiddevelopertesting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val launchButton = findViewById<Button>(R.id.startClick)

        val message = "This is my first window"

        launchButton.setOnClickListener {

            // Create an Intent to launch the SecondActivity
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("mymsg",message)
            startActivity(intent)

        }

    }
}