package com.example.flow

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flow.databinding.FragmentMenuFonemAwalanBinding
import com.example.flow.databinding.FragmentMenuPencampuranBunyiHurufBinding

class MenuFonemAwalan : Fragment() {

    private  lateinit var binding: FragmentMenuFonemAwalanBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuFonemAwalanBinding.inflate(layoutInflater, container, false)

        binding.backButton.setOnClickListener {
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, MenuFonem())?.commit()
        }

        binding.soal1.setOnClickListener {
            MediaPlayer.create(context, R.raw.nomor1_fonem_awal).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, FonemAwalanNo1())?.commit()
        }

        binding.soal2.setOnClickListener {
            MediaPlayer.create(context, R.raw.nomor2_fonem_awal).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, FonemAwalanNo2())?.commit()
        }

        binding.soal3.setOnClickListener {
            MediaPlayer.create(context, R.raw.nomor3_fonem_awal).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, FonemAwalanNo3())?.commit()
        }

        return binding.root
    }

}