package com.example.recyclerviewdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerViewAdapter(val playerList:List<PlayersItem>): RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.list_item,parent,false)
        return MyViewHolder(listItem)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val fruit = playerList[position]
        holder.bind(fruit)
    }

    override fun getItemCount(): Int {
        return playerList.size
    }


}

class MyViewHolder(val view: View): RecyclerView.ViewHolder(view) {
        fun bind(player: PlayersItem) {
            val myTextView = view.findViewById<TextView>(R.id.tvName)
            myTextView.text = player.name

            view.setOnClickListener {
                Toast.makeText(view.context, "${player.name}", Toast.LENGTH_SHORT).show()
            }
        }

}