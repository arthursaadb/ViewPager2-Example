package com.example.viewpager2example

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.layout_item.*

class ItemFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.layout_item, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            val alert = it.getString(KEY_ALERT)

            tv_alert.text = alert
        }
    }


    companion object {
        const val KEY_ALERT = "alert"
        fun newInstance(alert: String): ItemFragment =
            ItemFragment().apply {
                arguments = Bundle().apply {
                    putString(KEY_ALERT, alert)
                }
            }
    }
}