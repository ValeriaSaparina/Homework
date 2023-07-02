package com.example.homework2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.homework2.databinding.FragmentPlacesBinding

class PlacesFragment : Fragment(R.layout.fragment_places) {
    private var binding: FragmentPlacesBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentPlacesBinding.bind(view)

        binding?.run {
            btnAnother.setOnClickListener {
                val bundle = AnotherFragment.createBundle("PlacesFragment")
                findNavController().navigate(R.id.action_placesFragment_to_anotherFragment, bundle)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }


}