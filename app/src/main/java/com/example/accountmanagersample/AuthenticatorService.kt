package com.example.accountmanagersample

import android.app.Service
import android.content.Intent
import android.os.IBinder

class AuthenticatorService : Service() {

    override fun onBind(intent: Intent?): IBinder? {
        val authenticator = CustomAuthenticator(this)
        return authenticator.getIBinder()
    }
}