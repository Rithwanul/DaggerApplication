package com.example.daggerapplication.ui.activity

import android.os.Bundle
import android.widget.TextView
import com.example.daggerapplication.R
import com.example.daggerapplication.model.entity.Car
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        findViewById<TextView>(R.id.name).text = car.name
    }
}