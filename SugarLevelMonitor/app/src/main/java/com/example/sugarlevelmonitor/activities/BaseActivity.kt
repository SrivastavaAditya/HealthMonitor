package com.example.sugarlevelmonitor.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sugarlevelmonitor.utils.logInfo

open class BaseActivity : AppCompatActivity() {


    companion object{
        val TAG = BaseActivity.javaClass.simpleName
    }

    /*
     *
     * lifecycle method onCreate()
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logInfo(TAG, "onCreate()")
    }


    /*
     *
     * lifecycle method onStart()
     */
    override fun onStart() {
        super.onStart()
        logInfo(TAG, "onStart()")
    }


    /*
     *
     * lifecycle method onResume()
     */
    override fun onResume() {
        super.onResume()
        logInfo(TAG, "onResume()")
    }


    /*
     *
     * lifecycle method onPause()
     */
    override fun onPause() {
        super.onPause()
        logInfo(TAG, "onPause()")
    }


    /*
     *
     * lifecycle method onStop()
     */
    override fun onStop() {
        super.onStop()
        logInfo(TAG, "onStop()")
    }


    /*
     *
     * lifecycle method onDestroy()
     */
    override fun onDestroy() {
        super.onDestroy()
        logInfo(TAG, "onDestroy()")
    }
}
