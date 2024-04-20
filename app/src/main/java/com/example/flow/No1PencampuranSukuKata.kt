package com.example.flow

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flow.databinding.FragmentNo1PencampuranHurufBinding
import com.example.flow.databinding.FragmentNo1PencampuranSukuKataBinding

class No1PencampuranSukuKata : Fragment() {

    private  lateinit var binding: FragmentNo1PencampuranSukuKataBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNo1PencampuranSukuKataBinding.inflate(layoutInflater, container, false)

        binding.backButton.setOnClickListener {
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, MenuPencampuranBunyiSukuKata())?.commit()
        }

        binding.aButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_ember).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, No1PencampuranSukuKataBagianA())?.commit()
        }

        binding.bButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_ember).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, No1PencampuranSukuKataBagianB())?.commit()
        }

        binding.cButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_ember).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, No1PencampuranSukuKataBagianC())?.commit()
        }

        return binding.root
    }

}