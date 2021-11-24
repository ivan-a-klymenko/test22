package com.example.test23

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.test23.reflection.Person
import java.lang.reflect.Field

/**
 * @author ivan.a.klymenko@gmail.com on 21.09.2021
 */
private const val TAG = "LoginFragment"

class LoginFragment : Fragment() {

//    override fun getCurrentTag(): String = TAG

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        view.postDelayed({
//            findNavController().navigate(R.id.action_loginFragment_to_mainFragment)
//        }, 3000)
        startPersonLogic()
    }

    private fun startPersonLogic() {
        val person = Person()
        Log.d(TAG, person.toString())

        val nameField: Field = person.javaClass.getDeclaredField("name")
        nameField.isAccessible = true
        val name = nameField.get(person) as String
        Log.d(TAG, "name = $name")
        val name1 = "Umang Budhwar"
        nameField[person] = name1

        val pinCodeField = person.javaClass.getDeclaredField("pinCode")
        pinCodeField.isAccessible = true
        val pinCode = pinCodeField.getInt(person)
        Log.d(TAG, "pinCode = $pinCode")
        val pinCode1 = 411057
        pinCodeField.setInt(person, pinCode1)

        Log.d(TAG, person.toString())
    }

}