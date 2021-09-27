package com.example.test23

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * @author ivan.a.klymenko@gmail.com on 21.09.2021
 */
private const val TAG = "LoginFragment"

class MainFragment : LogFragment() {

    override fun getCurrentTag(): String = TAG

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }
}