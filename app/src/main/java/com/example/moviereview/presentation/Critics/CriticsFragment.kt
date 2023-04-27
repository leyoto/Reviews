package com.example.moviereview.presentation.Critics

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moviereview.databinding.FragmentCriticsBinding
import com.example.moviereview.R
import com.example.moviereview.data.api.ApiService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class CriticsFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private var _binding: FragmentCriticsBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter: CriticsAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCriticsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val listCritics = arrayListOf<com.example.moviereview.domain.critics.Result>()
        val retrofitInfo = Retrofit.Builder()
            .baseUrl("https://api.nytimes.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val infoCriticsApi = retrofitInfo.create(ApiService::class.java)
        CoroutineScope(Dispatchers.IO).launch {
            val infoCritics = infoCriticsApi.getCritics()
            withContext(Dispatchers.Main) {
                for (critic in infoCritics.results) {
                    listCritics.add(critic)
                }

                recyclerView = view.findViewById(R.id.rv_critics)
                recyclerView.layoutManager = LinearLayoutManager(requireContext())
                adapter = CriticsAdapter(listCritics)
                recyclerView.adapter = adapter

            }

        }

    }

}

