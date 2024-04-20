package com.example.flow

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flow.databinding.FragmentMenuPencampuranBunyiBinding
import com.example.flow.databinding.FragmentMenuSegmentasiBinding

class MenuSegmentasi : Fragment() {

    private  lateinit var binding: FragmentMenuSegmentasiBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuSegmentasiBinding.inflate(layoutInflater, container, false)

        binding.backButton.setOnClickListener {
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, Menu())?.commit()
        }

        binding.buttonMenu1.setOnClickListener {
            MediaPlayer.create(context, R.raw.bunyi_huruf).start()
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, MenuSegmentasiHuruf())?.commit()
        }

        binding.buttonMenu2.setOnClickListener {
            MediaPlayer.create(context, R.raw.bunyi_suku_kata).start()
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, MenuSegmentasiSukuKata())?.commit()
        }

        binding.buttonMenu3.setOnClickListener {
            MediaPlayer.create(context, R.raw.bunyi_kata).start()
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, MenuSegmentasiKata())?.commit()
        }

        return binding.root
    }

}