package com.dpicallo.tealiumcollectapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dpicallo.tealiumcollectapp.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            TealiumHelper.trackEvent("test_event", mapOf("tealium_trace_id" to "TgCGUiew"))
            //findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
        binding.login.setOnClickListener {
            TealiumHelper.trackEvent("user_login", mapOf("tealium_trace_id" to "XWEWFlrR", "customer_email_hash" to "7a98839f868612b21c63e718e313c91877f01cc72d22aee5650f9394d31eb0ad"))
            //findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}