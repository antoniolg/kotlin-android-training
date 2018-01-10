package com.antonioleiva.kotlinandroidtraining

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val loginRequest = LoginRequest()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submit.setOnClickListener {

            loginRequest.doLogin(username.text.toString(), password.text.toString()) { success ->

                toast(if (success) "Success" else "Failure")

            }

        }
    }
}