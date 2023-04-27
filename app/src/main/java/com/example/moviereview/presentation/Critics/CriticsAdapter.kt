package com.example.moviereview.presentation.Critics

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviereview.R
import com.example.moviereview.databinding.ItemCriticsBinding
import com.example.moviereview.domain.critics.critics
import com.squareup.picasso.Picasso

class CriticsAdapter(private val critics: List<com.example.moviereview.domain.critics.Result>): RecyclerView.Adapter<CriticsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CriticsViewHolder {
        val binding = ItemCriticsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CriticsViewHolder(binding)
    }
    override fun onBindViewHolder(
        holder: CriticsViewHolder,
        viewType: Int
    ) {
        with(holder){
            with(critics[position]){
                binding.textView.text=this.display_name
                Picasso.get()
                    .load(this.multimedia.resource.src)
                    .placeholder(R.drawable.critic_picture)
                    .fit()
                    .into(binding.imageView)
            }
        }
    }
    override fun getItemCount(): Int {
        return critics.size
    }
}

