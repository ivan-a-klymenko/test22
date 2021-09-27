package com.example.test23

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * @author ivan.a.klymenko@gmail.com on 21.09.2021
 */
private const val TAG = "LoginFragment"

class LoginFragment : LogFragment() {

    override fun getCurrentTag(): String = TAG

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        view.postDelayed({
//            findNavController().navigate(R.id.action_loginFragment_to_mainFragment)
//        }, 3000)
//    }

}