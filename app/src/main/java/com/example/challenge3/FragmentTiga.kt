package com.example.challenge3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.challenge3.databinding.FragmentTigaBinding


class FragmentTiga : Fragment() {
    private var _binding: FragmentTigaBinding? = null
    private val binding get() = _binding!!

    private val args: FragmentTigaArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTigaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//buat nulis yg di jenis pesawat terus manggil variabel yang dibikin args nerima fragment2 ke fragment ke3 termasuk argumen
        val pesawat = args.jenis
        binding.jenisPesawat.text="Jenis Pesawat: $pesawat"
        binding.Hasil.setOnClickListener {
            val pindah = FragmentTigaDirections.actionFragmentTigaToFragmentEmpat()
            pindah.jenisPesawat = pesawat
            it.findNavController().navigate(pindah)
        }
        //nerima data fragment 4 ke 3
        val payload = args.parsel
        val passanger = payload.beratPenumpang
        val kargo = payload.beratKargo
        val bagasi = payload.beratBagasi
        val totalPayload = passanger + kargo + bagasi
        if(passanger > 0){
            binding.numpang.text = "\npenumpang : $passanger"
            binding.info.text = "bagasi: $bagasi"
            binding.car.text = "kargo :$kargo"
            binding.result.text = "payload :$totalPayload"
        }

        }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null


    }

}