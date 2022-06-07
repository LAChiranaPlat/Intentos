package com.example.intentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class system : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_system)

        var name = intent.getStringExtra("nameUser")
        var lname = intent.getStringExtra("lnameUser")

        Log.i("message","Nombre de Usuario $name $lname")

    }

}