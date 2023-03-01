package com.example.realestatemanagementapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//This class is for creating a RecyclerView Adapter and binding the houses on the Recycler View

class HouseAdapter(private val houseList: ArrayList<House>) :
    RecyclerView.Adapter<HouseAdapter.HouseViewHolder>() {


    inner class HouseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val bedroom:TextView=itemView.findViewById(R.id.bedroom)
        val pricing:TextView=itemView.findViewById(R.id.cash)
        val place:TextView=itemView.findViewById(R.id.area)
        val image:ImageView=itemView.findViewById(R.id.image)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HouseViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.house,parent,false)
        return HouseViewHolder(itemView)


    }

    override fun getItemCount(): Int {
        return houseList.size
    }

    override fun onBindViewHolder(holder: HouseViewHolder, position: Int) {
        val currentItem=houseList[position]
        holder.image.setImageResource(currentItem.image)
        holder.bedroom.text=currentItem.bedroom
        holder.pricing.text=currentItem.price
        holder.place.text=currentItem.price



    }
}