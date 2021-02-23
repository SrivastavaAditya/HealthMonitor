package com.example.sugarlevelmonitor.activities

import android.animation.Animator
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_splash.*
import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.content.Intent


class SplashActivity : BaseActivity() {

    companion object{
        val TAG = SplashActivity.javaClass.simpleName
        var count = 2
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.sugarlevelmonitor.R.layout.activity_splash)

        startHeartAnimation()
    }


    private fun startHeartAnimation() {

        val scaleDown = ObjectAnimator.ofPropertyValuesHolder(
            rl_img,
            PropertyValuesHolder.ofFloat("scaleX", 1.2f),
            PropertyValuesHolder.ofFloat("scaleY", 1.2f)
        )
        scaleDown.duration = 1000


        scaleDown.repeatCount = ObjectAnimator.RESTART
        scaleDown.repeatMode = ObjectAnimator.REVERSE
        scaleDown.start()

        scaleDown.addListener(listener)
    }

    var listener = object : Animator.AnimatorListener{
        override fun onAnimationRepeat(animation: Animator?) {
        }

        override fun onAnimationEnd(animation: Animator?) {
            if(count>0){
                startHeartAnimation()
                count--
            }else{
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            }
        }

        override fun onAnimationCancel(animation: Animator?) {
        }

        override fun onAnimationStart(animation: Animator?) {
        }

    }
}
