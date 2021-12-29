package com.berk.jetpacknavigation.fragment

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.berk.jetpacknavigation.databinding.FragmentSetRecipientNameBinding

class SetRecipientNameFragment :
    BaseFragment<FragmentSetRecipientNameBinding>(FragmentSetRecipientNameBinding::inflate) {
    private val args: SetRecipientNameFragmentArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onClick()
    }

    private fun onClick() {
        binding.nextBtn.setOnClickListener {
            val name = binding.edtTextName.text.toString()
            val direction = SetRecipientNameFragmentDirections
                .actionSetRecipientNameFragmentToSetRecipientAmountFragment(name, args.totalmoney)
            findNavController().navigate(direction)
        }
        binding.cancelBtn.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}