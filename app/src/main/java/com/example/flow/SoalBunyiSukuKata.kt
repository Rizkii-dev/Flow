package com.example.flow

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flow.databinding.FragmentSoalBunyiHurufBinding
import com.example.flow.databinding.FragmentSoalBunyiSukuKataBinding

class SoalBunyiSukuKata : Fragment() {

    private  lateinit var binding: FragmentSoalBunyiSukuKataBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSoalBunyiSukuKataBinding.inflate(layoutInflater, container, false)

        binding.backButton.setOnClickListener {
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, MenuPenghapusBunyi())?.commit()
        }

        binding.aButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_piring).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, SoalBunyiSukuKata1())?.commit()
        }

        binding.bButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_piring).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, SoalBunyiSukuKata2())?.commit()
        }

        binding.cButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_piring).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, SoalBunyiSukuKata3())?.commit()
        }

        return binding.root
    }

}