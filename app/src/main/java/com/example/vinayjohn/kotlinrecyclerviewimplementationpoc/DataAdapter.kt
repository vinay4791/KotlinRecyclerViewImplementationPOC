package com.example.vinayjohn.kotlinrecyclerviewimplementationpoc

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by vinayjohn on 28/03/19.
 */
class DataAdapter(val data: ArrayList<String>) : RecyclerView.Adapter<DataAdapter.ViewHolder>() {


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.dataItem.text = data[position]
    }

    override fun getItemCount(): Int = data.size


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.data_row, parent, false)
        return ViewHolder(view)

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val dataItem: TextView = itemView.findViewById(R.id.data_txt)
    }

}