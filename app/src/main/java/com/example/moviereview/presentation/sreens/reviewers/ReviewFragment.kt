package com.example.moviereview.presentation.sreens.reviewers

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
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class ReviewFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private  var _binding: FragmentCriticsBinding? =null
    private val binding get() = _binding!!
    private lateinit var adapter: ReviewersAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        _binding = FragmentCriticsBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }



