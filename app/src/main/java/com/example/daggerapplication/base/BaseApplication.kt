package com.example.daggerapplication.base

import com.example.daggerapplication.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class BaseApplication: DaggerApplication() {


    override fun applicationInjector():
            AndroidInjector<out DaggerApplication> = DaggerAppComponent.builder().create(this)
}