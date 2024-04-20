package com.example.flow

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flow.databinding.FragmentMenuFonemBinding
import com.example.flow.databinding.FragmentMenuPencampuranBunyiBinding

class MenuFonem : Fragment() {

    private  lateinit var binding: FragmentMenuFonemBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuFonemBinding.inflate(layoutInflater, container, false)

        binding.backButton.setOnClickListener {
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, Menu())?.commit()
        }

        binding.buttonMenu1.setOnClickListener {
            MediaPlayer.create(context, R.raw.persamaan_awal).start()
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, MenuFonemAwalan())?.commit()
        }

        binding.buttonMenu2.setOnClickListener {
            MediaPlayer.create(context, R.raw.persamaan_akhir).start()
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, MenuFonemAkhiran())?.commit()
        }


        return binding.root
    }

}