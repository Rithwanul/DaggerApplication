package com.example.daggerapplication.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.daggerapplication.R
import com.example.daggerapplication.databinding.FragmentCharactersBinding
import com.example.daggerapplication.model.entity.Car
import dagger.android.support.DaggerFragment
import javax.inject.Inject


class CharactersFragment @Inject constructor(
    private val car: Car
) : Fragment() {

    private lateinit var binding: FragmentCharactersBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

         binding = DataBindingUtil
             .inflate<FragmentCharactersBinding>(inflater, R.layout.fragment_characters, container, false)

        return binding.root

//        return inflater.inflate(R.layout.fragment_characters, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.name.text = car.name
    }

}