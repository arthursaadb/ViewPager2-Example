package com.example.viewpager2example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configViewPagerView()
        configViewPagerFragment()
    }

    private fun configViewPagerView() {
        val adapter = ViewAdapter(getAlertList())
        pager_view.adapter = adapter
    }

    private fun configViewPagerFragment() {
        val adapter = FragmentAdapter(this, getAlertList())
        pager_fragment.adapter = adapter

        TabLayoutMediator(tab_indicator_fragment, pager_fragment) { tab, position ->

        }.attach()
    }


    private fun getAlertList() = listOf("alerta 1", "alerta 2", "alerta 3")
}