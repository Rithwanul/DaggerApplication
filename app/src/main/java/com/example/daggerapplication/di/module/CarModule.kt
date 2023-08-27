package com.example.daggerapplication.di.module

import com.example.daggerapplication.model.entity.Car
import dagger.Module
import dagger.Provides

@Module
class CarModule {

    @Provides
    fun provideCar() = Car("Ferrari")
}