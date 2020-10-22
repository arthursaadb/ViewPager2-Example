package com.example.viewpager2example

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentAdapter(fa: FragmentActivity, private val itemList: List<String>) :
    FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = itemList.size

    override fun createFragment(position: Int): Fragment =
        ItemFragment.newInstance(itemList[position])

}