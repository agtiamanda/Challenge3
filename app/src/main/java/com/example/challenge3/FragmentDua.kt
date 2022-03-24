package com.example.challenge3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.challenge3.databinding.FragmentBlankBinding
import com.example.challenge3.databinding.FragmentDuaBinding


class FragmentDua : Fragment() {
    var _binding: FragmentDuaBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDuaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnPesawat.setOnClickListener {
            val jenisPesawat = FragmentDuaDirections.actionFragmentDuaToFragmentTiga(DataPenumpang(0,0,0))
            jenisPesawat.jenis = binding.etBagasi.text.toString()
            it.findNavController().navigate(jenisPesawat)


        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}