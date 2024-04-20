package com.example.flow

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flow.databinding.FragmentMenuBunyiSukuKataBinding
import com.example.flow.databinding.FragmentMenuSegmentasiHurufBinding
import com.example.flow.databinding.FragmentSoal2BunyiSukuKataBinding

class MenuSegmentasiHuruf : Fragment() {

    private  lateinit var binding: FragmentMenuSegmentasiHurufBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuSegmentasiHurufBinding.inflate(layoutInflater, container, false)

        binding.backButton.setOnClickListener {
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, MenuSegmentasi())?.commit()
        }

        binding.soal1.setOnClickListener {
            MediaPlayer.create(context, R.raw.nomor1_segmentasi).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, SegementasiHurufNo1())?.commit()
        }

        binding.soal2.setOnClickListener {
            MediaPlayer.create(context, R.raw.nomor2_segmentasi).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, SegementasiHurufNo2())?.commit()
        }

        binding.soal3.setOnClickListener {
            MediaPlayer.create(context, R.raw.nomor3_segmentasi).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, SegementasiHurufNo3())?.commit()
        }

        binding.soal4.setOnClickListener {
            MediaPlayer.create(context, R.raw.nomor4_segmentasi).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, SegementasiHurufNo4())?.commit()
        }

        binding.soal5.setOnClickListener {
            MediaPlayer.create(context, R.raw.nomor5_segmentasi).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, SegementasiHurufNo5())?.commit()
        }

        return binding.root
    }

}