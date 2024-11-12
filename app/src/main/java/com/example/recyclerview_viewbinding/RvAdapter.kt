package com.example.recyclerview_viewbinding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_viewbinding.databinding.SingleItemBinding



class RvAdapter(var languageList: List<Language>,) : RecyclerView.Adapter<RvAdapter.ViewHolder>() {
    inner class ViewHolder(val binding: SingleItemBinding) : RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = SingleItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            with(languageList[position]){
                binding.tvLangName.text = this.name
                binding.tvExp.text = this.exp
            }
        }
    }
    override fun getItemCount(): Int {
        return languageList.size
    }
}