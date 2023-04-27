package com.example.moviereview.domain.critics

data class Result(
    val bio: String,
    val display_name: String,
    val multimedia: Multimedia,
    val seo_name: String,
    val sort_name: String,
    val status: String
)