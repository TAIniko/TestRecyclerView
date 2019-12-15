package com.example.test_recycler.main

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.test_recycler.R

class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val textView: TextView = itemView.findViewById(R.id.tv_item_model)
}