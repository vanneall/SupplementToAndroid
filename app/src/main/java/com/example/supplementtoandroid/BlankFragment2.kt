package com.example.supplementtoandroid

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class BlankFragment2 : Fragment() {

    private lateinit var navigation: NavigationInterface

    override fun onAttach(context: Context) {
        super.onAttach(context)
        navigation = context as NavigationInterface
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.imageView_back1).setOnClickListener {
            navigation.navigate(it)
            Log.d("tag1", "clicked")
        }
    }

}