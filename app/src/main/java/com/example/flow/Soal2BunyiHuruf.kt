package com.example.flow

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flow.databinding.FragmentSoal2BunyiHurufBinding
import com.example.flow.databinding.FragmentSoalBunyiHurufBinding

class Soal2BunyiHuruf : Fragment() {

    private  lateinit var binding: FragmentSoal2BunyiHurufBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSoal2BunyiHurufBinding.inflate(layoutInflater, container, false)

        binding.backButton.setOnClickListener {
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, MenuPenghapusBunyi())?.commit()
        }

        binding.aButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_udang).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, Soal2BunyiHuruf1())?.commit()
        }

        binding.bButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_udang).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, Soal2BunyiHuruf2())?.commit()
        }

        binding.cButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_udang).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, Soal2BunyiHuruf3())?.commit()
        }

        return binding.root
    }

}