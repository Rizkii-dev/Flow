package com.example.flow

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flow.databinding.FragmentMenuPenghapusBunyiBinding


class MenuPenghapusBunyi : Fragment() {

    private  lateinit var binding: FragmentMenuPenghapusBunyiBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuPenghapusBunyiBinding.inflate(layoutInflater, container, false)

        binding.backButton.setOnClickListener {
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, Menu())?.commit()
        }

        binding.buttonMenu1.setOnClickListener {
            MediaPlayer.create(context, R.raw.bunyi_huruf).start()
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, MenuBunyiHuruf())?.commit()
        }

        binding.buttonMenu2.setOnClickListener {
            MediaPlayer.create(context, R.raw.bunyi_suku_kata).start()
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, MenuBunyiSukuKata())?.commit()
        }

        binding.buttonMenu3.setOnClickListener {
            MediaPlayer.create(context, R.raw.bunyi_kata).start()
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, MenuBunyiKata())?.commit()
        }

        return binding.root
    }

}