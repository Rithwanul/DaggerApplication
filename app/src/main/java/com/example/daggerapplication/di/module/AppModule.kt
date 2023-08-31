package com.example.daggerapplication.di.module

import android.app.Application
import android.content.Context
import com.example.daggerapplication.base.BaseApplication
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
abstract class AppModule {

    @Binds
    abstract fun bindApplication(app: BaseApplication): Application

//    @Provides
//    @Singleton
//    fun provideContext(baseApplication: BaseApplication): Context = baseApplication
}