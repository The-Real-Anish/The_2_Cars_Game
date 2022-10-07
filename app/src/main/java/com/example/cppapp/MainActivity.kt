package com.example.cppapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {



    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    /**
     * A native method that is implemented by the 'cppapp' native library,
     * which is packaged with this application.
     */
    //external fun stringFromJNI(): String

    //overriding the original onCreate
    //TO BE DONE ONLY WHEN THE GAME STARTS
}

