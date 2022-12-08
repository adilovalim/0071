package com.example.a007

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.a007.databinding.FragmentSalesBinding

class SalesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_sales, container, false)
        val binding = FragmentSalesBinding.bind(view)

        binding.savat.setOnClickListener {
            findNavController().navigate(R.id.savatchaFragment)
        }
        return view
    }


}