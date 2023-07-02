package com.example.homework2

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.homework2.databinding.FragmentAnotherBinding
import com.google.android.material.snackbar.Snackbar
import java.lang.Exception

class AnotherFragment : Fragment(R.layout.fragment_another) {

    private var binding: FragmentAnotherBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Snackbar.make(view, arguments?.getString("ARG_NAME_FRAGMENT").toString(), Snackbar.LENGTH_LONG).show()
        binding = FragmentAnotherBinding.bind(view)
        binding?.run {
            btnPlaces.setOnClickListener {
                findNavController().navigate(R.id.action_anotherFragment_to_placesFragment)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {
        private const val ARG_NAME_FRAGMENT = "ARG_NAME_FRAGMENT"
        fun createBundle(name : String): Bundle {
            val bundle = Bundle()
            bundle.putString(ARG_NAME_FRAGMENT, name)
            return bundle
        }
    }

}