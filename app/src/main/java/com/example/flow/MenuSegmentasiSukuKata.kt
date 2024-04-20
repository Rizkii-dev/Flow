package com.example.flow

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flow.databinding.FragmentMenuSegmentasiHurufBinding
import com.example.flow.databinding.FragmentMenuSegmentasiSukuKataBinding

class MenuSegmentasiSukuKata : Fragment() {

    private  lateinit var binding: FragmentMenuSegmentasiSukuKataBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuSegmentasiSukuKataBinding.inflate(layoutInflater, container, false)

        binding.backButton.setOnClickListener {
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, MenuSegmentasi())?.commit()
        }

        binding.soal1.setOnClickListener {
            MediaPlayer.create(context, R.raw.nomor1_segmentasi).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, SegementasiSukuKataNo1())?.commit()
        }

        binding.soal2.setOnClickListener {
            MediaPlayer.create(context, R.raw.nomor2_segmentasi).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, SegementasiSukuKataNo2())?.commit()
        }

        binding.soal3.setOnClickListener {
            MediaPlayer.create(context, R.raw.nomor3_segmentasi).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, SegementasiSukuKataNo3())?.commit()
        }

        binding.soal4.setOnClickListener {
            MediaPlayer.create(context, R.raw.nomor4_segmentasi).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, SegementasiSukuKataNo4())?.commit()
        }

        binding.soal5.setOnClickListener {
            MediaPlayer.create(context, R.raw.nomor5_segmentasi).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, SegementasiSukuKataNo5())?.commit()
        }

        return binding.root
    }

}