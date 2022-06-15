package com.tinder.android.playground.ui.fragment

import android.app.Activity
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tinder.android.playground.R
import com.tinder.android.playground.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding?.message?.text = "Hello"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)

        return _binding!!.also {
            it.navigateToSecond.setOnClickListener {
                requireActivity().supportFragmentManager.beginTransaction()
                    .replace(R.id.container, SecondFragment())
                    .addToBackStack(null)
                    .commit()
            }
        }.root
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    override fun onDestroy() { // "Don't keep activities" flag enabled.
        super.onDestroy()
        _binding?.message?.text = "Hello"
    }

    override fun onDetach() { // "Don't keep activities" flag enabled.
        super.onDetach()
        _binding?.message?.text = "Hello"
    }

    companion object {
        const val TAG: String = "FirstFragment"
    }
}