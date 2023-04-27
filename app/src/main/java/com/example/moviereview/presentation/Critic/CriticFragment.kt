package com.example.moviereview.presentation.Critic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moviereview.R
import com.example.moviereview.data.api.ApiService
import com.example.moviereview.databinding.FragmentCriticBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class CriticFragment:Fragment() {
    private lateinit var recyclerView: RecyclerView
    private var _binding: FragmentCriticBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter: CriticAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCriticBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val listCritic = arrayListOf<com.example.moviereview.domain.critics.Result>()
        val retrofitInfo = Retrofit.Builder()
            .baseUrl("https://api.nytimes.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val infoCriticApi = retrofitInfo.create(ApiService::class.java)
        CoroutineScope(Dispatchers.IO).launch {
            val infoCritics = infoCriticApi.getCritics()
            withContext(Dispatchers.Main) {
                for (critic in infoCritics.results) {
                    listCritic.add(critic)
                }

                recyclerView = view.findViewById(R.id.rv_critic)
                recyclerView.layoutManager = LinearLayoutManager(requireContext())
                adapter = CriticAdapter(listCritic)
                recyclerView.adapter = adapter

            }

        }

    }
}




