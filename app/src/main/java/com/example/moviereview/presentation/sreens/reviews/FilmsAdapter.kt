package com.example.moviereview.presentation.sreens.reviews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviereview.domain.reviews.Reviews

class FilmsAdapter(val reviews:List<com.example.moviereview.domain.reviews.Result>): RecyclerView.Adapter<FilmsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmsViewHolder {
        val view=LayoutInflater.from(parent.context).inflate()
    }

    override fun getItemCount(): Int {
        return reviews.size
    }

    override fun onBindViewHolder(holder: FilmsViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}