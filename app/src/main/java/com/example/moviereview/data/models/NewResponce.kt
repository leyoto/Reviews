package com.example.moviereview.data.models

data class NewResponce(
    val copyright: String,
    val has_more: Boolean,
    val num_results: Int,
    val results: List<Result>,
    val status: String
)