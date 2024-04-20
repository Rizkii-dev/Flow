package com.example.flow

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flow.databinding.FragmentNo1PencampuranSukuKataBinding
import com.example.flow.databinding.FragmentNo3PencampuranSukuKataBinding

class No3PencampuranSukuKata : Fragment() {

    private  lateinit var binding: FragmentNo3PencampuranSukuKataBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNo3PencampuranSukuKataBinding.inflate(layoutInflater, container, false)

        binding.backButton.setOnClickListener {
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, MenuPencampuranBunyiSukuKata())?.commit()
        }

        binding.aButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_pena).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, No3PencampuranSukuKataBagianA())?.commit()
        }

        binding.bButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_pena).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, No3PencampuranSukuKataBagianB())?.commit()
        }

        binding.cButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_pena).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, No3PencampuranSukuKataBagianC())?.commit()
        }

        return binding.root
    }

}