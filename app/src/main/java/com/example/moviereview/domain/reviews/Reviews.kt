package com.example.moviereview.domain.reviews

import com.example.moviereview.domain.reviews.Result

data class Reviews(
    val copyright: String,
    val has_more: Boolean,
    val num_results: Int,
    val results: List<Result>,
    val status: String
)