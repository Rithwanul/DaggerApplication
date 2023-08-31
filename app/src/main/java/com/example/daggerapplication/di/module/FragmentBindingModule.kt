package com.example.daggerapplication.di.module

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.example.daggerapplication.di.key.FragmentKey
import com.example.daggerapplication.navigation.CustomFragmentFactory
import com.example.daggerapplication.ui.fragment.CharactersFragment
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class FragmentBindingModule {
    @Binds
    @IntoMap
    @FragmentKey(CharactersFragment::class)
    abstract fun bindMainFragment(mainFragment: CharactersFragment): Fragment

    @Binds
    abstract fun bindFragmentFactory(factory: CustomFragmentFactory): FragmentFactory
}