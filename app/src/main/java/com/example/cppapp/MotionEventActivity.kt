package com.example.cppapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView

class MotionEventActivity : AppCompatActivity() {

    //bringing the main-screen and cars into the play
    val blue_car: ImageView = findViewById(R.id.car_1)
    val red_car: ImageView = findViewById(R.id.car_2)
    val screen: ImageView = findViewById(R.id.game_screen)

    val blue_leftturn: Runnable =
        Runnable { blue_car.animate().rotationBy(-30f).duration = 500 }

    val blue_rightturn: Runnable =
        Runnable { blue_car.animate().rotationBy(30f).duration = 500 }

    val red_leftturn: Runnable =
        Runnable { red_car.animate().rotationBy(-30f).duration = 500 }

    val red_rightturn: Runnable =
        Runnable { red_car.animate().rotationBy(30f).duration = 500 }

    val blue_moveleft: Runnable =
        Runnable { blue_car.animate().translationXBy(-102.5f).duration = 1000 }

    val blue_moveright: Runnable =
        Runnable { blue_car.animate().translationXBy(102.5f).duration = 1000 }

    val red_moveleft: Runnable =
        Runnable { red_car.animate().translationXBy(-102.5f).duration = 1000 }

    val red_moveright: Runnable =
        Runnable { red_car.animate().translationXBy(102.5f).duration = 1000 }
    //blue_car should rotate clockwise and red_car should rotate anti-clockwise
    //when screen is touched
    private fun handleTouch(event: MotionEvent) {

        val ptrCount = event.pointerCount
        for(i in 0 until ptrCount) {

            val X = event.getX(i)
            val Y = event.getY(i)
            val ID = event.getPointerId(i)
            val action = event.actionMasked

            when(action) {
                MotionEvent.ACTION_DOWN ->
                    if(i == 0){ blue_rightturn.run() }
                    else if(i % 2 == 1){ blue_moveright.run() }
                    else if(i % 4 == 2){ blue_leftturn.run() }
                    else{ blue_rightturn.run() }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        screen
    }
}