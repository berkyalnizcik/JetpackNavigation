package com.berk.jetpacknavigation.fragment

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.berk.jetpacknavigation.databinding.FragmentDepositBinding

class DepositFragment : BaseFragment<FragmentDepositBinding>(FragmentDepositBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onClick()
    }

    private fun onClick() {
        binding.apply {
            addBtn.setOnClickListener {
                val addmoney = edtTextAmount.text.toString()
                val direction =
                    DepositFragmentDirections.actionDepositFragmentToDepositSuccessfulFragment(
                        addmoney.toInt()
                    )
                findNavController().navigate(direction)
            }
            cancelBtn.setOnClickListener {
                findNavController().navigateUp()
            }
        }
    }
}