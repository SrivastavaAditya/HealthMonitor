package com.example.sugarlevelmonitor.activities

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Toast
import com.example.sugarlevelmonitor.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    companion object{
        val TAG = MainActivity.javaClass.simpleName
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var animation = AnimationUtils.loadAnimation(this,
            R.anim.fade_in_zoom_in_slide_down
        );
        animation.setAnimationListener(animListener)
        blood_drop.startAnimation(animation)
    }

    var animListener: Animation.AnimationListener = object: Animation.AnimationListener{
        override fun onAnimationRepeat(animation: Animation?) {
        }

        override fun onAnimationEnd(animation: Animation?) {
            Toast.makeText(applicationContext, "AnimationBuilder Finished", Toast.LENGTH_LONG).show()
        }

        override fun onAnimationStart(animation: Animation?) {
        }

    }
}


