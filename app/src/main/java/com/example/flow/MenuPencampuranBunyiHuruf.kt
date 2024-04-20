package com.example.flow

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flow.databinding.FragmentMenuPencampuranBunyiHurufBinding
import com.example.flow.databinding.FragmentMenuPencampuranBunyiSukuKataBinding

class MenuPencampuranBunyiHuruf : Fragment() {

    private  lateinit var binding: FragmentMenuPencampuranBunyiHurufBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuPencampuranBunyiHurufBinding.inflate(layoutInflater, container, false)

        binding.backButton.setOnClickListener {
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, MenuPencampuranBunyi())?.commit()
        }

        binding.soal1.setOnClickListener {
            MediaPlayer.create(context, R.raw.nomor1_pencampuran_bunyi_huruf).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, No1PencampuranHuruf())?.commit()
        }

        binding.soal2.setOnClickListener {
            MediaPlayer.create(context, R.raw.nomor2_pencampuran_bunyi_huruf).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, No2PencampuranHuruf())?.commit()
        }

        binding.soal3.setOnClickListener {
            MediaPlayer.create(context, R.raw.nomor3_pencampuran_bunyi_huruf).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, No3PencampuranHuruf())?.commit()
        }

        return binding.root
    }

}