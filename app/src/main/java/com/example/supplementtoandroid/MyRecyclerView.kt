package com.example.supplementtoandroid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerView(var mutableList: MutableList<String>, val listener: NavigationInterface) :
    RecyclerView.Adapter<MyRecyclerView.ViewHolder>() {

    class ViewHolder(view: View, listener: NavigationInterface) : RecyclerView.ViewHolder(view) {
        private var s: TextView = view.findViewById(R.id.textView)

        init {
            s.setOnClickListener{
                listener.navigate(it)
            }
        }

        fun bind(string: String) {
            s.text = string

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list, parent, false), listener)
    }

    override fun getItemCount(): Int {
        return mutableList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(mutableList[position])
    }
}