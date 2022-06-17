package com.example.mymaps

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.mymaps.models.UserMaps

private const val TAG="MapsAdapter"
class MapsAdapter(val context:Context, val userMaps:List<UserMaps>, val onClickListener: OnClickListener) : RecyclerView.Adapter<MapsAdapter.ViewHolder>() {
    interface OnClickListener{
        fun onItemClick(position: Int)
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1, parent, false)
        return ViewHolder(view)
    }
    override fun getItemCount() = userMaps.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val userMaps = userMaps[position]
        holder.itemView.setOnClickListener{
            Log.i(TAG, "Tapped on position $position")
            onClickListener.onItemClick(position)
        }
        val textViewTital = holder.itemView.findViewById<TextView>(android.R.id.text1)
        textViewTital.text = userMaps.title
    }


}
