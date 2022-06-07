package com.example.intentos

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentos.databinding.ActivityRedesSocialesBinding
import com.google.android.material.textfield.TextInputLayout

class RedesSociales : AppCompatActivity() {

    lateinit var layout: ActivityRedesSocialesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        layout= ActivityRedesSocialesBinding.inflate(layoutInflater)

        setContentView(layout.root)

        layout.btnFacebook.setOnClickListener {
            val i= packageManager.getLaunchIntentForPackage("com.facebook.katana")
            startActivity(i)
        }

        layout.btnInstagram.setOnClickListener {
            startActivity(packageManager.getLaunchIntentForPackage("com.instagram.android"))
        }

        layout.btnTwitter.setOnClickListener {

            val uri= Uri.parse("https://material.io/")

            startActivity( Intent(Intent.ACTION_VIEW,uri))


        }
    }
}