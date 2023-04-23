package com.example.moviereview.data.api
import com.example.moviereview.domain.critics.critics
import com.example.moviereview.domain.reviews.Link
import com.example.moviereview.domain.reviews.Reviews
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import kotlin.Result as Result

private fun Retrofit.Builder.addConveterFactory(create: GsonConverterFactory): Any {
    TODO("Not yet implemented")
}

private fun Any.baseUrl(baseUrl: String): Any {
    TODO("Not yet implemented")
}

private fun Any.build(): Any {
    TODO("Not yet implemented")
}

private fun Any.create(java: Class<ApiService>): ApiService {

}

interface ApiService {
    @GET("svc/movies/v2/critics/all.json?api-key=GW5a0tJfWOcfQ7k3dpQizIsrmpZ33Bmm")
    suspend fun getCritics(): List<critics>
    companion object {
        var BASE_URL = "https://api.nytimes.com/"
        fun create: ApiService{
            val retrofit = Retrofit.Builder ()
                .addConveterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(ApiService::class.java)


        }
    }
    @GET("svc/movies/v2/reviews/search.json?api-key=GW5a0tJfWOcfQ7k3dpQizIsrmpZ33Bmm")
    suspend fun getReviews():List<com.example.moviereview.domain.reviews.Result>
}