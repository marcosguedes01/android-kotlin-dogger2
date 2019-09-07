package com.programacaobrasil.androiddagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.internal.DaggerCollections

class MainActivity : AppCompatActivity() {

    private var car: Car? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerCarComponent.create();
        car = component.getCar()
        car?.drive()
    }
}
