package com.example.moviereview.data.api
import com.example.moviereview.domain.critics.critics
import com.example.moviereview.domain.reviews.Link
import retrofit2.http.GET
import kotlin.Result as Result

interface ApiService {
    @GET("/reviews/{type}.json")
    suspend fun getReviews(): List<Link>
    @GET("/critics/{reviewer}.json")
    suspend fun getCritics():List<critics>
}