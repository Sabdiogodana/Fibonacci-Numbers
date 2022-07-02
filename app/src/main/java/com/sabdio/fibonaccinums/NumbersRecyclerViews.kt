package com.sabdio.fibonaccinums

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class NumbersRecyclerViews(var numberList:List<Int>):RecyclerView.Adapter<NumbersRecyclerViews.NumberViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NumbersRecyclerViews.NumberViewHolder {
        var  itemView=LayoutInflater.from(parent.context).inflate(R.layout.numbers_list_items,parent,false)
        return NumberViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumbersRecyclerViews.NumberViewHolder, position: Int) {
        holder.tvNumbers.text = numberList.get(position).toString()

    }

    override fun getItemCount(): Int {
        return numberList.size

    }
    class  NumberViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var tvNumbers = itemView.findViewById<TextView>(R.id.tvNumbers)
    }
}