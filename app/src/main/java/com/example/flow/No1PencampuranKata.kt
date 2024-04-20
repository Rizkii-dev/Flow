package com.example.flow

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flow.databinding.FragmentNo1PencampuranKataBinding
import com.example.flow.databinding.FragmentNo1PencampuranSukuKataBinding

class No1PencampuranKata : Fragment() {

    private  lateinit var binding: FragmentNo1PencampuranKataBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNo1PencampuranKataBinding.inflate(layoutInflater, container, false)

        binding.backButton.setOnClickListener {
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, MenuPencampuranBunyiKata())?.commit()
        }

        binding.aButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_sikat_gigi).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, No1PencampuranKataBagianA())?.commit()
        }

        binding.bButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_sikat_gigi).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, No1PencampuranKataBagianB())?.commit()
        }

        return binding.root
    }

}