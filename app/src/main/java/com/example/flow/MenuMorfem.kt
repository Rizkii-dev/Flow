package com.example.flow

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flow.databinding.FragmentMenuMorfemBinding
import com.example.flow.databinding.FragmentMenuSegmentasiHurufBinding

class MenuMorfem : Fragment() {

    private  lateinit var binding: FragmentMenuMorfemBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuMorfemBinding.inflate(layoutInflater, container, false)

        binding.backButton.setOnClickListener {
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, Menu())?.commit()
        }

        binding.soal1.setOnClickListener {
            MediaPlayer.create(context, R.raw.nomor1_morfem).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, MorfemNo1())?.commit()
        }

        binding.soal2.setOnClickListener {
            MediaPlayer.create(context, R.raw.nomor2_morfem).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, MorfemNo2())?.commit()
        }

        binding.soal3.setOnClickListener {
            MediaPlayer.create(context, R.raw.nomor3_morfem).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, MorfemNo3())?.commit()
        }

        binding.soal4.setOnClickListener {
            MediaPlayer.create(context, R.raw.nomor4_morfem).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, MorfemNo4())?.commit()
        }

        binding.soal5.setOnClickListener {
            MediaPlayer.create(context, R.raw.nomor5_morfem).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, MorfemNo5())?.commit()
        }

        return binding.root
    }

}