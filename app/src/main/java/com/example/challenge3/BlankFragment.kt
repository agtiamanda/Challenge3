package com.example.challenge3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.challenge3.databinding.FragmentBlankBinding


class BlankFragment : Fragment() {
    private var _binding: FragmentBlankBinding?=null
    private val binding get()=_binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentBlankBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.utama.setOnClickListener {
            it.findNavController().navigate(R.id.action_blankFragment_to_fragmentDua)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }
}