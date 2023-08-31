package com.example.daggerapplication.di.module

import androidx.fragment.app.Fragment
import com.example.daggerapplication.navigation.CustomNavHost
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class NavHostModule {

    @ContributesAndroidInjector(modules = [
        FragmentBindingModule::class
    ])
    abstract fun contributeNavHost(): CustomNavHost
}