package com.example.flow

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flow.databinding.FragmentNo1PencampuranHurufBinding
import com.example.flow.databinding.FragmentNo3PencampuranHurufBinding

class No3PencampuranHuruf : Fragment() {

    private  lateinit var binding: FragmentNo3PencampuranHurufBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNo3PencampuranHurufBinding.inflate(layoutInflater, container, false)

        binding.backButton.setOnClickListener {
            fragmentManager?.beginTransaction()?.replace(R.id.media_layout, MenuPencampuranBunyi())?.commit()
        }

        binding.aButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_obat).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, No3PencampuranHurufBagianA())?.commit()
        }

        binding.bButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_obat).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, No3PencampuranHurufBagianB())?.commit()
        }

        binding.cButton.setOnClickListener {
            MediaPlayer.create(context, R.raw.pertanyaan_obat).start()
            fragmentManager?.beginTransaction()?.replace(R.id.question_layout, No3PencampuranHurufBagianC())?.commit()
        }

        return binding.root
    }

}