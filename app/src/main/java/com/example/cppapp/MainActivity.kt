package com.example.cppapp

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.graphics.Point
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.view.View.OnClickListener
import android.view.View.OnTouchListener
import android.view.animation.Animation
import android.view.animation.LinearInterpolator
import android.widget.ImageView
import androidx.core.view.marginLeft
import androidx.core.view.marginStart

class MainActivity : AppCompatActivity() {

    @SuppressLint("RestrictedApi", "ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {

        //var blue_rightturn: Boolean = true
        //var red_rightturn: Boolean = false

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val blueCar: ImageView = findViewById(R.id.car_1)

        val redCar: ImageView = findViewById(R.id.car_2)

        val screen: ImageView = findViewById(R.id.game_screen)

        val centralLine: View = findViewById(R.id.line_2)

        val distance: Float = centralLine.marginStart.toFloat()

        var blueGoRight = true
        var redGoRight = false

        val blueEvent: Array<MotionEvent> = emptyArray()
        val redEvent: Array<MotionEvent> = emptyArray()

        //val blue_moveright = ObjectAnimator.ofFloat(blue_car, View.TRANSLATION_X,
        //                                            blue_car.translationX, blue_car.translationX + 102.5f)
        //blue_moveright.duration = 500
        //blue_moveright.interpolator = LinearInterpolator()

        //blue_moveright.start()

        //fun setOnClickListenerWithPoint(action: (Point) -> Int) {

        //}

        //screen.setOnTouchListener()

        /*screen.setOnClickListener { view ->

            var touchedX = null
            Log.d("Abscissa", touchedX.toString())
            Log.d("Distance of line", distance.toString())
            if(touchedX < distance) {

                Log.d("Blue right turn - ", blueGoRight.toString())
                blueCar.animate().apply {
                    duration = 500
                    //rotationBy(30f)
                    blueGoRight = if (blueGoRight) {
                        translationXBy(294f)

                        false
                    } else {
                        translationXBy(-294f)
                        true
                    }
                }.start()

            } else {

                Log.d("Red right turn - ", redGoRight.toString())
                redCar.animate().apply {
                    duration = 500
                    //rotationBy(-30f)
                    redGoRight = if (redGoRight) {
                        translationXBy(294f)
                        false
                    } else {
                        translationXBy(-294f)
                        true
                    }
                }.start()

            }

        }*/

        screen.setOnTouchListener { _, event ->

            if(event.action == MotionEvent.ACTION_DOWN) {

                val touchedX: Float = event.x

                //The next few lines record logs of motion
                //Primarily to be used for testing, final app might not need it

                /*Log.d("Abscissa", touchedX.toString())
                Log.d("Time", event.eventTime.toString())
                Log.d("Distance of line", distance.toString())*/

                if (touchedX < distance) {

                    Log.d("Blue right turn - ", blueGoRight.toString())
                    blueCar.animate().apply {
                        duration = 200
                        //rotationBy(30f)
                        blueGoRight = if (blueGoRight) {

                            //conversion of dp to float is currently using hardcoded values
                            //Approx scale used: 35f = 12dp, so range around 294-297?
                            //TODO Later: change from hardcoded values to px-density dependent values
                            translationX(294f)
                            false
                        } else {
                            translationX(0f)
                            true
                        }
                    }.start()

                } else {

                    Log.d("Red right turn - ", redGoRight.toString())
                    redCar.animate().apply {
                        duration = 200
                        //rotationBy(-30f)
                        redGoRight = if (redGoRight) {
                            translationX(883f)
                            false
                        } else {
                            translationX(589f)
                            true
                        }
                    }.start()

                }
            }
            true
        }

    }

    //TO BE DONE ONLY WHEN THE GAME STARTS
}

