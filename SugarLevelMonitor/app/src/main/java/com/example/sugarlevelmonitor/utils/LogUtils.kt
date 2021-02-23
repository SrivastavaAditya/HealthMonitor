package com.example.sugarlevelmonitor.utils

import android.util.Log

public fun logError(tag: String, message: String){
    Log.e(tag, message)
}


public fun logInfo(tag: String, message: String){
    Log.i(tag, message)
}


public fun logDebug(tag: String, message: String){
    Log.d(tag, message)
}