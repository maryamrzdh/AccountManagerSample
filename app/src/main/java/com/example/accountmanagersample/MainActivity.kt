package com.example.accountmanagersample

import android.accounts.Account
import android.accounts.AccountManager
import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn=findViewById<Button>(R.id.button)
        btn.setOnClickListener{
            startActivity(Intent(this,SecondActivity::class.java))
        }

        val accountManager = AccountManager.get(this) //this is Activity

        val account = Account("maryam", "com.example.accountmanagersample")
        val success = accountManager.addAccountExplicitly(account, "123qwe", null)
        if (success) {
            Log.d(TAG, "Account created")
        } else {
            Log.d(TAG, "Account creation failed. Look at previous logs to investigate")
        }




//        val accounts = am.getAccountsByType("com.google")

//        addNewAccount("com.example.accountmanagersample", "")
//
//        am.getAuthToken(
//                accounts[0],                     // Account retrieved using getAccountsByType()
//                "Manage your tasks",            // Auth scope
//                options,                        // Authenticator-specific options
//                this,                           // Your activity
//                OnTokenAcquired(),              // Callback called when a token is successfully acquired
//                null             // Callback called if an error occurs
//        )
    }

//    private class OnTokenAcquired : AccountManagerCallback<Bundle> {
//
//        override fun run(result: AccountManagerFuture<Bundle>) {
//            // Get the result of the operation from the AccountManagerFuture.
//            val bundle: Bundle = result.getResult()
//
//            // The token is a named value in the bundle. The name of the value
//            // is stored in the constant AccountManager.KEY_AUTHTOKEN.
//            val token: String = bundle.getString(AccountManager.KEY_AUTHTOKEN).toString()
//        }
//    }

//    private fun addNewAccount(accountType: String, authTokenType: String) {
//        val future: AccountManagerFuture<Bundle> = am.addAccount(
//            accountType,
//            authTokenType,
//            null,
//            null,
//            this,
//            AccountManagerCallback<Bundle> { future ->
//                try {
//                    val bnd = future.result
////                showMessage("Account was created")
//                    Log.d("udinic", "AddNewAccount Bundle is $bnd")
//                } catch (e: Exception) {
//                    e.printStackTrace()
////                showMessage(e.message)
//                }
//            },
//            null
//        )
//    }

}


