package com.example.intentos

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentos.databinding.ActivityMapasBinding

class Mapas : AppCompatActivity() {

    lateinit var layout:ActivityMapasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        layout= ActivityMapasBinding.inflate(layoutInflater)

        setContentView(layout.root)

        layout.btnGo.setOnClickListener {

            val intento: Intent = Intent(Intent.ACTION_VIEW)

            var str:String = "geo:0,0?q="+layout.tilAddres.editText?.text.toString()

            intento.apply {
                data=Uri.parse(str)
            }

            startActivity(intento)


        }

    }
}