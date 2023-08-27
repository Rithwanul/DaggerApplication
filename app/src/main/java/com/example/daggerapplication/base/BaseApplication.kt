package com.example.daggerapplication.base

import android.app.Activity
import com.example.daggerapplication.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.DispatchingAndroidInjector
import javax.inject.Inject

class BaseApplication: DaggerApplication() {


    override fun applicationInjector():
            AndroidInjector<out DaggerApplication> = DaggerAppComponent
        .builder().create(this)
}