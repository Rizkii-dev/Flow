package com.example.flow

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flow.databinding.FragmentNo1PencampuranHurufBinding
import com.example.flow.databinding.FragmentSoal3BunyiSukuKataBinding

class No1PencampuranHuruf : Fragment() {

    private  lateinit var binding: FragmentNo1PencampuranHurufBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNo1PencampuranHurufBinding.inflate(layoutInflater, container, false)

        binding.backButton.setOnClickListener {
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, MenuPencampuranBunyi())?.commit()
        }

        binding.aButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_apel).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, No1PencampuranHurufBagianA())?.commit()
        }

        binding.bButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_apel).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, No1PencampuranHurufBagianB())?.commit()
        }

        binding.cButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_apel).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, No1PencampuranHurufBagianC())?.commit()
        }

        return binding.root
    }

}