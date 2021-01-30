package com.app.plannerapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import com.app.plannerapp.R
import com.app.plannerapp.ui.Pager
import com.google.android.material.tabs.TabLayout


class HomeFragment : Fragment() , TabLayout.OnTabSelectedListener {

    private lateinit var homeViewModel: HomeViewModel
    var viewpager: ViewPager?=null
    var tablayout : TabLayout ?=null
    var viewPager : ViewPager ?=null
    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View? {
        homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        init(root)
        setadapter()
        return root
    }
    fun setadapter(){
        val adapter = Pager(fragmentManager, tablayout!!.tabCount)

        //Adding adapter to pager

        //Adding adapter to pager
        viewPager!!.adapter = adapter

        //Adding onTabSelectedListener to swipe views

        //Adding onTabSelectedListener to swipe views
        tablayout!!.setOnTabSelectedListener(this)
    }
    fun init(root:View){
        tablayout = root.findViewById(R.id.tabs)
        viewpager = root.findViewById(R.id.viewpager)
        tablayout!!.addTab(tablayout!!.newTab().setText("Tab1"));
        tablayout!!.addTab(tablayout!!.newTab().setText("Tab2"));
        tablayout!!.addTab(tablayout!!.newTab().setText("Tab3"));
        tablayout!!.setTabGravity(TabLayout.GRAVITY_FILL);
    }

    override fun onTabReselected(tab: TabLayout.Tab?) {
        TODO("Not yet implemented")
    }

    override fun onTabUnselected(tab: TabLayout.Tab?) {
        TODO("Not yet implemented")
    }

    override fun onTabSelected(tab: TabLayout.Tab?) {
        TODO("Not yet implemented")
    }
}