package com.example.daggerapplication.di.module

import com.example.daggerapplication.ui.activity.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = [
        CarModule::class
    ])
    abstract fun contributeMainActivity(): MainActivity
}