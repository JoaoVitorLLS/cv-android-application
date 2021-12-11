package com.github.cvandroidapplication.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.github.cvandroidapplication.databinding.FragmentAboutMeBinding
import com.github.cvandroidapplication.viewmodels.AboutMeViewModel

class AboutMeFragment : Fragment() {

    private lateinit var aboutMeViewModel: AboutMeViewModel
    private var _binding: FragmentAboutMeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        aboutMeViewModel =
            ViewModelProvider(this).get(AboutMeViewModel::class.java)

        _binding = FragmentAboutMeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textAboutMe
        aboutMeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}