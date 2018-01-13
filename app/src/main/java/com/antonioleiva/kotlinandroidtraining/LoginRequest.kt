package com.antonioleiva.kotlinandroidtraining

sealed class Response
object Success : Response()
data class Failure(val error: String) : Response()

class LoginRequest {

    fun doLogin(user: String?, password: String?, callback: (Response) -> Unit) {
        val success = !user.isNullOrEmpty() && !password.isNullOrEmpty()
        callback(if (success) Success else Failure("User or password is empty"))
    }
}