package com.example.myapplication

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    override fun onStart() {
        super.onStart()
        setContentView(R.layout.activity_main)
        android.util.Log.d("start", "Приложение запускается")
    }

    override fun onResume() {
        super.onResume()
        android.util.Log.d("resume", "Приложение запущено")
    }

    override fun onPostResume() {
        super.onPostResume()
        android.util.Log.d("postresume", "Приложение было запущенно с последнего момента")
    }

    override fun onPause() {
        super.onPause()
        android.util.Log.d("pause", "Приложение на паузе")
    }

    override fun onStop() {
        super.onStop()
        android.util.Log.d("stop", "Приложение остановлено")
    }

    override fun onRestart() {
        super.onRestart()
        android.util.Log.d("restart", "Приложение перезапущено")
    }

    override fun onDestroy() {
        super.onDestroy()
        android.util.Log.d("destroy", "Приложение уничтожено")
    }



}

