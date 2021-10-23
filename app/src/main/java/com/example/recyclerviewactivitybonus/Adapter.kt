package com.example.recyclerviewactivitybonus

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewactivitybonus.databinding.ItemRowBinding

class Adapter (private val info: ArrayList<String>?): RecyclerView.Adapter<Adapter.MessageViewHolder>(){
    class MessageViewHolder(val binding: ItemRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        return MessageViewHolder(ItemRowBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val user = info!![position]

        holder.binding.apply {
            tv.text = user
        }
    }

    override fun getItemCount() = info!!.size
}