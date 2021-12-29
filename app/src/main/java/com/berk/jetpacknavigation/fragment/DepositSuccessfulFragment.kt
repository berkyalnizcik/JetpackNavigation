package com.berk.jetpacknavigation.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.berk.jetpacknavigation.databinding.FragmentDepositSuccessfulBinding

class DepositSuccessfulFragment :
    BaseFragment<FragmentDepositSuccessfulBinding>(FragmentDepositSuccessfulBinding::inflate) {
    private val args: DepositSuccessfulFragmentArgs by navArgs()

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var totalmoney = 0
        val addmoney = args.addmoney
        if (addmoney != 0) {
            binding.tvMessage.text = "Congratulations!! \n deposit successful."
            totalmoney = totalmoney + addmoney
            binding.tvTotalMoney.text = totalmoney.toString() + "$"
        } else {
            binding.tvMessage.text = "Somethings Went Wrong..Try Again!!"
        }
        binding.sendMoneyBtn.setOnClickListener {
            val direction = DepositSuccessfulFragmentDirections
                .actionDepositSuccessfulFragmentToSetRecipientNameFragment(totalmoney)
            findNavController().navigate(direction)
        }
    }
}