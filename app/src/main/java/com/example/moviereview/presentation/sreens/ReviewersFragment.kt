package com.example.moviereview.presentation.sreens

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.moviereview.R

class ReviewersFragment : Fragment() {

    companion object {
        fun newInstance() = ReviewersFragment()
    }

    private lateinit var viewModel: ReviewersViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_reviewers, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ReviewersViewModel::class.java)
        // TODO: Use the ViewModel
    }

}