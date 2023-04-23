package com.example.keepcoding01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println ("Esto es un log")
        val miTag = "Mitag"
        Log.v(miTag,"Esto es un log con v")
        Log.d(miTag,"Esto es un log con d")
        Log.i(miTag,"Esto es un log con i")
        Log.w(miTag,"Esto es un log con w")
        Log.e(miTag,"Esto es un log con e")

    }
}