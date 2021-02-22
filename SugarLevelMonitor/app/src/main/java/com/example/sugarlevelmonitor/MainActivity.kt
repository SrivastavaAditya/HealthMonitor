package com.example.sugarlevelmonitor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var animation = AnimationUtils.loadAnimation(this, R.anim.zoom_in);
        animation.setAnimationListener(animListener)
        blood_drop.startAnimation(animation)
    }

    var animListener: Animation.AnimationListener = object: Animation.AnimationListener{
        override fun onAnimationRepeat(animation: Animation?) {
        }

        override fun onAnimationEnd(animation: Animation?) {
            Toast.makeText(applicationContext, "Animation Finished", Toast.LENGTH_LONG).show()
        }

        override fun onAnimationStart(animation: Animation?) {
        }

    }
}


