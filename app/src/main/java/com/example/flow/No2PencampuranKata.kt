package com.example.flow

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flow.databinding.FragmentNo1PencampuranKataBinding
import com.example.flow.databinding.FragmentNo2PencampuranKataBinding

class No2PencampuranKata : Fragment() {

    private  lateinit var binding: FragmentNo2PencampuranKataBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNo2PencampuranKataBinding.inflate(layoutInflater, container, false)

        binding.backButton.setOnClickListener {
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, MenuPencampuranBunyiKata())?.commit()
        }

        binding.aButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_kaos_kaki).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, No2PencampuranKataBagianA())?.commit()
        }

        binding.bButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_kaos_kaki).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, No2PencampuranKataBagianB())?.commit()
        }

        return binding.root
    }

}