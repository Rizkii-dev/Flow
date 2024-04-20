package com.example.flow

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import com.example.flow.databinding.FragmentCorrectBinding
import com.example.flow.databinding.FragmentWrongBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Wrong : Fragment() {

    private  lateinit var binding: FragmentWrongBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWrongBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

}