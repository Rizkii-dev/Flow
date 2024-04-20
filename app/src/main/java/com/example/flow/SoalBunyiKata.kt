package com.example.flow

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flow.databinding.FragmentSoal3BunyiSukuKataBinding
import com.example.flow.databinding.FragmentSoalBunyiKataBinding

class SoalBunyiKata : Fragment() {

    private  lateinit var binding: FragmentSoalBunyiKataBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSoalBunyiKataBinding.inflate(layoutInflater, container, false)

        binding.backButton.setOnClickListener {
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, MenuPenghapusBunyi())?.commit()
        }

        binding.aButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_meja_makan).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, SoalBunyiKata1())?.commit()
        }

        binding.bButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_meja_makan).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, SoalBunyiKata2())?.commit()
        }

        binding.cButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_meja_makan).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, SoalBunyiKata3())?.commit()
        }

        return binding.root
    }

}