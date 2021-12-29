package com.berk.jetpacknavigation.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.navArgs
import com.berk.jetpacknavigation.databinding.FragmentSendMoneySuccessfulBinding

class SendMoneySuccessfulFragment :
    BaseFragment<FragmentSendMoneySuccessfulBinding>(FragmentSendMoneySuccessfulBinding::inflate) {
    private val args: SendMoneySuccessfulFragmentArgs by navArgs()

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val name = args.name
        val amount = args.amount
        if (args.amount.isNotEmpty() && args.name.isNotEmpty()) {
            binding.tvMessage.text = "Congratulations!! \n ${amount}$ was sent to $name."
        } else {
            binding.tvMessage.text = "Somethings Went Wrong..Try Again!!"
        }
    }
}