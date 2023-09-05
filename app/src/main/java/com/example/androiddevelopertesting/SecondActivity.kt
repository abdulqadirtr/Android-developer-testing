package com.example.androiddevelopertesting

import android.app.Application
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val viewLayout = findViewById<ConstraintLayout>(R.id.layout)


        val message = intent.getStringExtra("mymsg")

       Snackbar.make(viewLayout, message.toString(), Snackbar.LENGTH_LONG).show()

    }
}