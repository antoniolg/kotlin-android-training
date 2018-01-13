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

        submit.setOnClickListener { onSubmitClicked() }
    }

    private fun onSubmitClicked() {
        loginRequest.doLogin(username.text.toString(), password.text.toString()) { success ->

            if (success)
                toast("Success")
            else
                showFailureSnackbar()

        }
    }

    private fun showFailureSnackbar() {
        container.snack("There was an error! Check your Internet", Snackbar.LENGTH_INDEFINITE) {
            setAction("Retry") { toast("Retrying") }
        }
    }
}