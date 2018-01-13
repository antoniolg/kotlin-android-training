package com.antonioleiva.kotlinandroidtraining

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val loginRequest = LoginRequest()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Kotlin rules"
        submit.setOnClickListener { onSubmitClicked() }
    }

    private fun onSubmitClicked() {
        loginRequest.doLogin(username.text?.toString(), password.text?.toString()) { response ->

            when (response) {
                Success -> toast("Success")
                is Failure -> showFailureSnackbar(response.error)
            }
        }
    }

    private fun showFailureSnackbar(error: String) {
        container.snack(error, Snackbar.LENGTH_INDEFINITE) {
            setAction("Retry") { toast("Retrying") }
        }
    }
}