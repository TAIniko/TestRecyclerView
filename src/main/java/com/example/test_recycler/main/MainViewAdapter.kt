package com.example.test_recycler.main

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.test_recycler.model.ItemModel
import com.example.test_recycler.R
import android.view.LayoutInflater
import android.widget.TextView

class MainViewAdapter(
    private val list: List<ItemModel>,
    private  val listener: ListListener
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    interface ListListener {
        fun onClickItem(tappedView: View, itemModel: ItemModel)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val itemView: View = LayoutInflater.from(parent.context).inflate(R.layout.part_item_model, parent, false)
        return MainViewHolder(
            itemView
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder.itemView.findViewById<TextView>(R.id.tv_item_model).text = list[position].text
        holder.itemView.setOnClickListener {
            listener.onClickItem(it, list[position])
        }
    }

    override fun getItemCount(): Int = list.size
}