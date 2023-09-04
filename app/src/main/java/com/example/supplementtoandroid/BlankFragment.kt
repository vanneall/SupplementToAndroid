package com.example.supplementtoandroid

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

class BlankFragment : Fragment() {

    private lateinit var navigation: NavigationInterface

    override fun onAttach(context: Context) {
        super.onAttach(context)
        navigation = context as NavigationInterface
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rec = view.findViewById<RecyclerView>(R.id.recyclerView)
        val adapter = MyRecyclerView(mutableListOf("Первая строка", "Вторая строка"), navigation)
        rec.adapter = adapter


        view.findViewById<Button>(R.id.fab_add).setOnClickListener {
            navigation.navigate(it)
        }
    }
}