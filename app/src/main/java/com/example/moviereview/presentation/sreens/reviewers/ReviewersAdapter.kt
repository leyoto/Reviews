package com.example.moviereview.presentation.sreens.reviewers

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviereview.domain.critics.critics

class ReviewersAdapter (val reviews:List<critics>): RecyclerView.Adapter<ReviewViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewViewHolder {
        val view= LayoutInflater.from(parent.context).inflate()
    }

    override fun getItemCount(): Int {
        return reviews.size
    }

    override fun onBindViewHolder(holder: ReviewViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}