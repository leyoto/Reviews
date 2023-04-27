package com.example.moviereview.presentation.Films
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviereview.R
import com.example.moviereview.databinding.ItemArticleBinding
import com.squareup.picasso.Picasso


class FilmsAdapter(private val reviews:List<com.example.moviereview.domain.reviews.Result>): RecyclerView.Adapter<FilmsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmsViewHolder {
        val binding = ItemArticleBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return FilmsViewHolder(binding)

    }

    override fun onBindViewHolder(
        holder: FilmsViewHolder,
        position: Int
    ) {
        with(holder){
            with(reviews[position]){
                binding.title.text=this.byline
                binding.description.text=this.summary_short
                binding.criticName.text=this.critics_pick.toString()
                binding.date.text=this.publication_date
                binding.time.text=this.opening_date
                Picasso.get()
                    .load(this.multimedia.src)
                    .placeholder(R.drawable.image)
                    .fit()
                    .into(binding.imageRev)
            }
        }
    }


    override fun getItemCount(): Int {
        return reviews.size
    }

}

