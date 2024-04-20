package com.example.flow

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flow.databinding.FragmentNo1PencampuranSukuKataBinding
import com.example.flow.databinding.FragmentNo2PencampuranSukuKataBinding

class No2PencampuranSukuKata : Fragment() {

    private  lateinit var binding: FragmentNo2PencampuranSukuKataBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNo2PencampuranSukuKataBinding.inflate(layoutInflater, container, false)

        binding.backButton.setOnClickListener {
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, MenuPencampuranBunyiSukuKata())?.commit()
        }

        binding.aButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_buku).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, No2PencampuranSukuKataBagianA())?.commit()
        }

        binding.bButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_buku).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, No2PencampuranSukuKataBagianB())?.commit()
        }

        binding.cButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_buku).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, No2PencampuranSukuKataBagianC())?.commit()
        }

        return binding.root
    }

}