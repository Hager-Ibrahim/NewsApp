package com.example.newsapp.presentation.modules.main.presentaion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.newsapp.R
import com.example.newsapp.databinding.FragmentMainBinding
import com.example.newsapp.presentation.modules.main.presentaion.adapter.MainPagerAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : Fragment(R.layout.fragment_main) {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(layoutInflater, null, false)
        setupPager()
        setBottomNavigation()

        return binding.root
    }

    private fun setupPager() {
        binding.pager.adapter = MainPagerAdapter(this)
        binding.pager.offscreenPageLimit = 4
    }

    private fun setBottomNavigation() {
        binding.apply {
            bottomNav.setOnNavigationItemSelectedListener { item ->

                when (item.itemId) {
                    R.id.home -> {
                        pager.currentItem = 0
                        true
                    }
                    R.id.search -> {
                        pager.currentItem = 1
                        true
                    }

                    R.id.bookmarks -> {
                        pager.currentItem = 2
                        true
                    }
                    R.id.settings -> {
                        pager.currentItem = 3
                        true
                    }
                    else -> false
                }
            }
        }
    }

}