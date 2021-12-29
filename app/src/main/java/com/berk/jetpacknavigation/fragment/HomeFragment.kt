package com.berk.jetpacknavigation.fragment

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.berk.jetpacknavigation.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onClick()
    }

    private fun onClick() {
        binding.addMoneyBtn.setOnClickListener {
            val direction = HomeFragmentDirections.actionHomeFragmentToDepositFragment()
            findNavController().navigate(direction)
        }
    }
}