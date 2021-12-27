package com.example.consumingdatafrominternetapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.consumingdatafrominternetapp.databinding.FragmentOverviewBinding


/**
 * A simple [Fragment] subclass.
 * Use the [OverviewFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class OverviewFragment : Fragment() {

    private val viewModel:   OverviewViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val binding = FragmentOverviewBinding.inflate(inflater)

        //vinculando Photo Adapter


        //permitindo databinding observar livedata com o ciclo de vida do fragmento
        binding.lifecycleOwner = this


        //giving the binding access to the OverviewViewModel
        binding.viewModel = viewModel

        return binding.root
    }

}