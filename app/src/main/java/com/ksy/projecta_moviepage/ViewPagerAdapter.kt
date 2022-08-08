package com.ksy.projecta_moviepage

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class ViewPagerAdapter(fm : FragmentManager) : FragmentStatePagerAdapter(fm) {
    override fun getCount() = 6

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0       ->  MovieFragmentA()
            1       ->  MovieFragmentB()
            2       ->  MovieFragmentC()
            3       ->  MovieFragmentD()
            4       ->  MovieFragmentE()
            else       ->  MovieFragmentF()
        }
    }

}