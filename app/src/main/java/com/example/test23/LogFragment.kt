package com.example.test23

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment


abstract class LogFragment : Fragment() {

    abstract fun getCurrentTag(): String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(getCurrentTag(), "onCreate")
    }

//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        Log.d(getCurrentTag(), "onCreateView")
//        return inflater.inflate(R.layout.fragment_log, container, false)
//    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(getCurrentTag(), "onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d(getCurrentTag(), "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(getCurrentTag(), "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(getCurrentTag(), "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(getCurrentTag(), "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(getCurrentTag(), "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(getCurrentTag(), "onDestroy")
    }

}