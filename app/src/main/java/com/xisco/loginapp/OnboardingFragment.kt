package com.xisco.loginapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.xisco.loginapp.databinding.FragmentOnboardingBinding

class OnboardingFragment : Fragment() {
            private lateinit var binding: FragmentOnboardingBinding

            override fun onCreateView(
                        inflater: LayoutInflater, container: ViewGroup?,
                        savedInstanceState: Bundle?
            ): View? {
                        // Inflate the layout for this fragment
                        binding = DataBindingUtil.inflate(
                                    inflater,
                                    R.layout.fragment_onboarding,
                                    container,
                                    false
                        )

                        binding.apply {
                                    btnRegister.setOnClickListener {
                                                findNavController().navigate(R.id.action_onboardingFragment_to_registerFragment)
                                    }

                                    btnLogin.setOnClickListener {
                                                findNavController().navigate(R.id.action_onboardingFragment_to_loginFragment)
                                    }
                        }
                        return binding.root
//                        return inflater.inflate(R.layout.fragment_onboarding, container, false)
            }
}