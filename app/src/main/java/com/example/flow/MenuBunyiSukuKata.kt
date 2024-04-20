package com.example.flow

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flow.databinding.FragmentMenuBunyiHurufBinding
import com.example.flow.databinding.FragmentMenuBunyiSukuKataBinding

class MenuBunyiSukuKata : Fragment() {

    private  lateinit var binding: FragmentMenuBunyiSukuKataBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuBunyiSukuKataBinding.inflate(layoutInflater, container, false)

        binding.backButton.setOnClickListener {
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, MenuPenghapusBunyi())?.commit()
        }

        binding.soal1.setOnClickListener {
            MediaPlayer.create(context, R.raw.nomor1_penghapusan_bunyi_suku_kata).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, SoalBunyiSukuKata())?.commit()
        }

        binding.soal2.setOnClickListener {
            MediaPlayer.create(context, R.raw.nomor2_penghapusan_bunyi_suku_kata).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, Soal2BunyiSukuKata())?.commit()
        }

        binding.soal3.setOnClickListener {
            MediaPlayer.create(context, R.raw.nomor3_pencampuran_bunyi_suku_kata).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, Soal3BunyiSukuKata())?.commit()
        }

        return binding.root
    }

}