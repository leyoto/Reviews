package com.example.moviereview.domain.critics

data class critics(
    val copyright: String,
    val num_results: Int,
    val results: List<Result>,
    val status: String
)