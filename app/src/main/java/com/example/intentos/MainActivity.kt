package com.example.intentos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var layout:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        layout= ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(layout.root)

        layout.btnIntro.setOnClickListener {

            startActivity(
                Intent(this,system::class.java).apply {
                    putExtra("nameUser","Rogger")
                    putExtra("lnameUser","Espino")
                    putExtra("Edad","35")
                    putExtra("Carrera","Contador")
                }
            )

        }

        layout.btnAlarmas.setOnClickListener {

            startActivity(Intent(this,Alarmas::class.java))

        }

        layout.btnMapas.setOnClickListener {
            startActivity(Intent(this,Mapas::class.java))
        }

        layout.btnRedes.setOnClickListener {

            startActivity(Intent(this, RedesSociales::class.java))

        }
    }

}