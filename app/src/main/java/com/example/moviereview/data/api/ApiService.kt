package com.example.moviereview.data.api
import com.example.moviereview.domain.critics.critics
import com.example.moviereview.domain.reviews.Reviews
import retrofit2.http.GET

interface ApiService {
    @GET("svc/movies/v2/critics/all.json?api-key=GW5a0tJfWOcfQ7k3dpQizIsrmpZ33Bmm")
    suspend fun getCritics(): critics

    @GET("svc/movies/v2/reviews/search.json?api-key=GW5a0tJfWOcfQ7k3dpQizIsrmpZ33Bmm")
    suspend fun getReviews():Reviews
}