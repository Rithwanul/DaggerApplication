package com.example.daggerapplication.di.module

import android.content.Context
import com.example.daggerapplication.base.BaseApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class AppModule {

    @Provides
    @Singleton
    fun provideContext(baseApplication: BaseApplication): Context = baseApplication
}