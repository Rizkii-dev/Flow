package com.example.flow

import android.graphics.Color
import android.media.AudioAttributes
import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flow.databinding.FragmentMenuBinding
import java.util.Locale.Builder


class Menu : Fragment() {

    private  lateinit var binding: FragmentMenuBinding
    private  lateinit var mediaPlayer: MediaPlayer

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuBinding.inflate(layoutInflater, container, false)

        binding.buttonMenu1.setOnClickListener {
            MediaPlayer.create(context, R.raw.penghapusan_bunyi).start()
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, MenuPenghapusBunyi())?.commit()
        }

        binding.buttonMenu2.setOnClickListener {
            MediaPlayer.create(context, R.raw.pencampuran_bunyi).start()
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, MenuPencampuranBunyi())?.commit()
        }

        binding.buttonMenu3.setOnClickListener {
            MediaPlayer.create(context, R.raw.segmentasi).start()
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, MenuSegmentasi())?.commit()
        }

        binding.buttonMenu4.setOnClickListener {
            MediaPlayer.create(context, R.raw.morfem).start()
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, MenuMorfem())?.commit()
        }

        binding.buttonMenu5.setOnClickListener {
            MediaPlayer.create(context, R.raw.fonem).start()
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, MenuFonem())?.commit()
        }

        return binding.root
    }


}