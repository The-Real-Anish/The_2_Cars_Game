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

        val blue_car: ImageView? = findViewById(R.id.car_1)

        val red_car: ImageView? = findViewById(R.id.car_2)

        val screen: ImageView? = findViewById(R.id.game_screen)

        //var blue_rightturn: Boolean = true
        //var red_rightturn: Boolean = false

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //bringing the game screen and cars into the play

        screen?.setOnClickListener {

            blue_car!!.animate().apply {
                duration = 500
                rotationBy(30f)
                //translationYBy(-50f)
            }.start()

            //blue_rightturn = !blue_rightturn

            //red_car.animate().apply {
            //    duration = 500
            //    rotationBy(-30f)
            //    translationXBy(-102f)
            //}.start()

            //red_rightturn = !red_rightturn

        }

    }

    /**
     * A native method that is implemented by the 'cppapp' native library,
     * which is packaged with this application.
     */
    //external fun stringFromJNI(): String

    //overriding the original onCreate
    //TO BE DONE ONLY WHEN THE GAME STARTS
}

