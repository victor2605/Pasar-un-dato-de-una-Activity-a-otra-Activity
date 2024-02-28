package com.example.pasarundatodeunaactivityaotraactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.view.View

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        button.setOnClickListener(View.OnClickListener {
            openActivity2()
        })
    }

    private fun openActivity2() {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}