package com.example.accountmanagersample

import android.accounts.Account
import android.accounts.AccountManager
import android.app.Dialog
import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Window
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondActivity : AppCompatActivity() {
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var adapter: AccountAdapter
    private lateinit var recycler: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val accountManager = AccountManager.get(this) //this is Activity

        linearLayoutManager=LinearLayoutManager(this)
         recycler=findViewById<RecyclerView>(R.id.accounts_list)
        recycler.layoutManager=linearLayoutManager



//        val account = Account("admin", "com.example.accountmanagersample")
       val account=accountManager.accounts

        val listName=ArrayList<String>()
        for (i in account){
         listName.add(i.name)
        }
//        showDialog(listName)

        adapter= AccountAdapter(mList = listName)
        recycler.adapter=adapter
    }
//
//    private fun showDialog(title: ArrayList<String>) {
//        val dialog = Dialog(this)
//        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
//        dialog.setCancelable(false)
//        dialog.setContentView(R.layout.custom_layout)
//
//
//
//
//
//
////        val body = dialog.findViewById(R.id.body) as TextView
////        body.text = title
//        val yesBtn = dialog.findViewById(R.id.yesBtn) as Button
//        val noBtn = dialog.findViewById(R.id.noBtn) as TextView
//        yesBtn.setOnClickListener {
//            dialog.dismiss()
//        }
//        noBtn.setOnClickListener { dialog.dismiss() }
//        dialog.show()
//
//    }
}