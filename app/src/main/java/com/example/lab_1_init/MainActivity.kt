package com.example.lab_1_init
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {

    private val oncreate: String = "ONCREATE"
    private val onstart: String = "ONSTART"
    private val onresume: String = "ONRESUME"
    private val onpause: String = "ONPAUSE"
    private val onstop: String = "ONSTOP"
    private val ondestroy: String = "ONDESTROY"

    private var count: Int = 0
    private val TAG:String = "TAG"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(TAG, "OnCreate() called")
    }

    override fun onStart() {
        super.onStart()

        Log.i(TAG, "OnStart() called")
    }
    override fun onResume() {
        super.onResume()

        Log.i(TAG, "OnResume() called")
    }

    override fun onPause() {
        super.onPause()

        Log.i(TAG, "onPause() called")
    }
    override fun onStop() {
        super.onStop()

        Log.i(TAG, "onStop() called")
    }
    override fun onDestroy() {
        super.onDestroy()

        Log.i(TAG, "onDestroy() called")
    }
}