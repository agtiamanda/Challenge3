package com.example.challenge3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.challenge3.databinding.FragmentEmpatBinding
import com.example.challenge3.databinding.FragmentTigaBinding


class FragmentEmpat : Fragment() {
    private lateinit var binding: FragmentEmpatBinding
    val args: FragmentEmpatArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEmpatBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnPayload.setOnClickListener {
            if (binding.pertama.text.isNullOrEmpty()) {
                Toast.makeText(requireContext(), "Kolom masih kosong", Toast.LENGTH_LONG)
                    .show()
            } else {

                val penumpang = DataPenumpang(
                    binding.pertama.text.toString().toInt(),
                    binding.kedua.text.toString().toInt(),
                    binding.ketiga.text.toString().toInt()
                )

                val bagasi = FragmentEmpatDirections.actionFragmentEmpatToFragmentTiga(penumpang)
                bagasi.jenis = args.jenisPesawat
                it.findNavController().navigate(bagasi)


            }
        }

    }
}