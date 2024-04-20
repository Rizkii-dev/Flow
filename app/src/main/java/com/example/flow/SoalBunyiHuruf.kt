package com.example.flow

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flow.databinding.FragmentMenuBunyiHurufBinding
import com.example.flow.databinding.FragmentSoalBunyiHurufBinding

class SoalBunyiHuruf : Fragment() {

    private  lateinit var binding: FragmentSoalBunyiHurufBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSoalBunyiHurufBinding.inflate(layoutInflater, container, false)

        binding.backButton.setOnClickListener {
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, MenuPenghapusBunyi())?.commit()
        }

        binding.aButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_ikan).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, SoalBunyiHuruf1())?.commit()
        }

        binding.bButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_ikan).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, SoalBunyiHuruf2())?.commit()
        }

        binding.cButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_ikan).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, SoalBunyiHuruf3())?.commit()
        }

        return binding.root
    }

}