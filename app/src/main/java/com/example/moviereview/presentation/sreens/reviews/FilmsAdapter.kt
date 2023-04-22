package com.example.moviereview.presentation.sreens.reviews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FilmsAdapter: RecyclerView.Adapter<FilmsAdapter.FilmsViewHolder>() {
    var listFilms = emptyList<Result>()
    class FilmsViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmsViewHolder {
        val view=LayoutInflater.from(parent.context).

    }

    override fun getItemCount(): Int {

    }

    override fun onBindViewHolder(holder: FilmsViewHolder, position: Int) {

    }

}
}