package com.app.plannerapp.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class Pager(fm: FragmentManager?, tabCount: Int) : FragmentStatePagerAdapter(fm!!) {

    var tabCount = 0
    init {
        this.tabCount = tabCount
    }

    override fun getItem(position: Int): Fragment {
        //Returning the current tabs
        return when (position) {
            0 -> {
                DailyFragment()
            }
            1 -> {
                DailyFragment()
            }
            2 -> {
                DailyFragment()
            }
            else -> DailyFragment()
        }
    }

    //Overriden method getCount to get the number of tabs
    override fun getCount(): Int {
        return tabCount
    }
}