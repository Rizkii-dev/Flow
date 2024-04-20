package com.example.flow

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flow.databinding.FragmentMenuBunyiHurufBinding
import com.example.flow.databinding.FragmentMenuPenghapusBunyiBinding

class MenuBunyiHuruf : Fragment() {

    private  lateinit var binding: FragmentMenuBunyiHurufBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuBunyiHurufBinding.inflate(layoutInflater, container, false)

        binding.backButton.setOnClickListener {
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, MenuPenghapusBunyi())?.commit()
        }

        binding.soal1.setOnClickListener {
            MediaPlayer.create(context, R.raw.nomor1_penghapusan_bunyi_huruf).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, SoalBunyiHuruf())?.commit()
        }

        binding.soal2.setOnClickListener {
            MediaPlayer.create(context, R.raw.nomor2_penghapusan_bunyi_huruf).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, Soal2BunyiHuruf())?.commit()
        }

        binding.soal3.setOnClickListener {
            MediaPlayer.create(context, R.raw.nomor3_penghapusan_bunyi_huruf).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, Soal3BunyiHuruf())?.commit()
        }

        return binding.root
    }

}