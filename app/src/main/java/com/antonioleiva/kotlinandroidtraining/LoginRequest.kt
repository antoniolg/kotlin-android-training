package com.antonioleiva.kotlinandroidtraining

class LoginRequest {

    fun doLogin(user: String?, password: String?, callback: (Boolean) -> Unit) {
        callback(!user.isNullOrEmpty() && !password.isNullOrEmpty())
    }
}