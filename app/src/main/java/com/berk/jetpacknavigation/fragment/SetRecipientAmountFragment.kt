package com.berk.jetpacknavigation.fragment

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.berk.jetpacknavigation.databinding.FragmentSetRecipientAmountBinding

class SetRecipientAmountFragment :
    BaseFragment<FragmentSetRecipientAmountBinding>(FragmentSetRecipientAmountBinding::inflate) {
    private val args: SetRecipientAmountFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onClick()
    }

    private fun onClick() {
        binding.apply {
            sendBtn.setOnClickListener {
                val totalmoney = args.addmoney
                val amount = edtTextAmount.text.toString()
                if (totalmoney >= amount.toInt()) {
                    val direction =
                        SetRecipientAmountFragmentDirections.actionSetRecipientAmountFragmentToSendMoneySuccessfulFragment(
                            amount,
                            args.name
                        )
                    findNavController().navigate(direction)
                } else {
                    tvError.visibility = View.VISIBLE
                }
            }
            cancelBtn.setOnClickListener {
                findNavController().navigateUp()
            }
        }
    }
}