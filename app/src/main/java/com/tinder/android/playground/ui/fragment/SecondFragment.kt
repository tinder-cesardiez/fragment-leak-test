package com.tinder.android.playground.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tinder.android.playground.R
import com.tinder.android.playground.databinding.FragmentSecondBinding
import com.tinder.android.playground.ui.fragment.FirstFragment.Companion.TAG

class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding?.yotext?.text = "Hello"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)

        return _binding!!.also {
            it.navigateToFirst.setOnClickListener {
                requireActivity().supportFragmentManager.beginTransaction()
                    .replace(R.id.container, FirstFragment())
                    .commitNow()
            }
        }.root
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding?.yotext?.text = "Hello"
    }
}