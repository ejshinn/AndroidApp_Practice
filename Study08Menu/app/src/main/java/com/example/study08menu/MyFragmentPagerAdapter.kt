package com.example.study08menu

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyFragmentPagerAdapter(activity:FragmentActivity): FragmentStateAdapter(activity) {
    val fragments : List<Fragment>

    init{
        fragments = listOf(OneFragment(),TwoFragment(), ThreeFragment())
    }

    override fun getItemCount(): Int  = fragments.size
    override fun createFragment(position: Int): Fragment =fragments[position]
//    override fun getItemCount(): Int {
//        return  fragments.size
//    }
//
//    override fun createFragment(position: Int): Fragment {
//       return fragments[position]
//    }
}