package com.example.newsapp.presentation.modules.main.presentaion.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.newsapp.presentation.modules.bookmarks.presentation.BookmarksFragment
import com.example.newsapp.presentation.modules.home.HomeFragment
import com.example.newsapp.presentation.modules.search.presentation.SearchFragment
import com.example.newsapp.presentation.modules.settings.presentation.SettingsFragment

class MainPagerAdapter(fragment: Fragment) :
    FragmentStateAdapter(fragment) {
    override fun getItemCount() = 4

    override fun createFragment(position: Int): Fragment {
            return when (position) {
                0 -> {
                    HomeFragment()
                }
                1 -> {
                     SearchFragment()
                }

                2->{
                    BookmarksFragment()
                }

                3->{
                    SettingsFragment()
                }
                else -> throw IllegalArgumentException("too many fragments!")
            }
        }
    }