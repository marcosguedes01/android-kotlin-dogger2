package com.programacaobrasil.androiddagger2

import android.util.Log
import javax.inject.Inject

class Car{
    val engine: Engine
    val wheels: Wheels

    companion object {
        val TAG = "Car"
    }

    @Inject
    constructor(engine: Engine, wheels: Wheels) {
        this.engine = engine
        this.wheels = wheels
    }

    fun drive():String{
        val driving = "driving...";
        //Log.d(TAG, "driving...")
        return driving
    }
}