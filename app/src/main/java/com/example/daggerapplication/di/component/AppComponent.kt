package com.example.daggerapplication.di.component

import com.example.daggerapplication.base.BaseApplication
import com.example.daggerapplication.di.module.ActivityBuilderModule
import com.example.daggerapplication.di.module.AppModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(modules = [
    AndroidSupportInjectionModule::class,
    ActivityBuilderModule::class,
    AppModule::class
])
interface AppComponent: AndroidInjector<BaseApplication> {
    @Component.Builder
    abstract class Builder: AndroidInjector.Builder<BaseApplication>() {
        abstract override fun build(): AppComponent
    }
}