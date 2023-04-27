package com.example.moviereview.presentation.Critic

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviereview.R
import com.example.moviereview.databinding.FragmentCriticBinding
import com.squareup.picasso.Picasso


class CriticAdapter(private val critic: List<com.example.moviereview.domain.critics.Result>): RecyclerView.Adapter<CriticViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CriticViewHolder {
        val binding = FragmentCriticBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CriticViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return critic.size
    }

    override fun onBindViewHolder(holder: CriticViewHolder, position: Int) {
        with(holder) {
            with(critic[position]){
                binding.textView5.text=this.display_name
                Picasso.get()
                    .load(this.multimedia.resource.src)
                    .placeholder(R.drawable.critic_picture)
                    .fit()
                    .into(binding.imageView5)
            }

        }



    }
}