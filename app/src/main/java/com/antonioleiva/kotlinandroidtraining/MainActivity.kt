package com.antonioleiva.kotlinandroidtraining

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submit.setOnClickListener {
            val message = "user: ${username.text}, pass: ${password.text}"
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
    }
}