package com.example.flow

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flow.databinding.FragmentNo1PencampuranKataBinding
import com.example.flow.databinding.FragmentNo3PencampuranKataBinding

class No3PencampuranKata : Fragment() {

    private  lateinit var binding: FragmentNo3PencampuranKataBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNo3PencampuranKataBinding.inflate(layoutInflater, container, false)

        binding.backButton.setOnClickListener {
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, MenuPencampuranBunyiKata())?.commit()
        }

        binding.aButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_lemari_baju).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, No3PencampuranKataBagianA())?.commit()
        }

        binding.bButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_lemari_baju).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, No3PencampuranKataBagianB())?.commit()
        }

        return binding.root
    }

}