package com.example.flow

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flow.databinding.FragmentMenuFonemAkhiranBinding
import com.example.flow.databinding.FragmentMenuFonemAwalanBinding

class MenuFonemAkhiran : Fragment() {

    private  lateinit var binding: FragmentMenuFonemAkhiranBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuFonemAkhiranBinding.inflate(layoutInflater, container, false)

        binding.backButton.setOnClickListener {
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, MenuFonem())?.commit()
        }

        binding.soal1.setOnClickListener {
            MediaPlayer.create(context, R.raw.nomor1_fonem_akhir).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, FonemAkhiranNo1())?.commit()
        }

        binding.soal2.setOnClickListener {
            MediaPlayer.create(context, R.raw.nomor2_fonem_akhir).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, FonemAkhiranNo2())?.commit()
        }

        binding.soal3.setOnClickListener {
            MediaPlayer.create(context, R.raw.nomor3_fonem_akhir).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, FonemAkhiranNo3())?.commit()
        }

        return binding.root
    }

}