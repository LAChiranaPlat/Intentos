package com.example.intentos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.util.Log
import com.example.intentos.databinding.ActivityAlarmasBinding
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat

class Alarmas : AppCompatActivity() {

    lateinit var layout:ActivityAlarmasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        layout= ActivityAlarmasBinding.inflate(layoutInflater)

        setContentView(layout.root)

        layout.btnSet.setOnClickListener {

            val reloj = MaterialTimePicker.Builder()
                .setTimeFormat(TimeFormat.CLOCK_12H)
                .setHour(0)
                .setMinute(0)
                .setTitleText("Establecer su Hora")
                .setPositiveButtonText("Marcar Alarma")
                .setNegativeButtonText("Cancelar")
                .build()

            reloj.apply {

                addOnPositiveButtonClickListener{

                    val intentAlarma: Intent = Intent(AlarmClock.ACTION_SET_ALARM)

                    intentAlarma.apply {
                        putExtra(AlarmClock.EXTRA_HOUR,reloj.hour)
                        putExtra(AlarmClock.EXTRA_MINUTES,reloj.minute)
                        putExtra(AlarmClock.EXTRA_MESSAGE,"Clases de Android Developer")
                    }

                    startActivity(intentAlarma)

                }

                addOnNegativeButtonClickListener{
                    Log.i("message","No se configuro una alarma")
                }

                show(supportFragmentManager,"relojito")

            }

        }

        layout.btnGet.setOnClickListener {

            startActivity( Intent(AlarmClock.ACTION_SHOW_ALARMS) )

        }
    }
}