package com.example.flow

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flow.databinding.FragmentSoal2BunyiHurufBinding
import com.example.flow.databinding.FragmentSoal3BunyiHurufBinding

class Soal3BunyiHuruf : Fragment() {

    private  lateinit var binding: FragmentSoal3BunyiHurufBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSoal3BunyiHurufBinding.inflate(layoutInflater, container, false)

        binding.backButton.setOnClickListener {
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, MenuPenghapusBunyi())?.commit()
        }

        binding.aButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_api).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, Soal3BunyiHuruf1())?.commit()
        }

        binding.bButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_api).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, Soal3BunyiHuruf2())?.commit()
        }

        binding.cButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_api).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, Soal3BunyiHuruf3())?.commit()
        }

        return binding.root
    }

}