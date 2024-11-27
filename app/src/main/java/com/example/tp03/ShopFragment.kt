package com.example.tp03.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.tp03.MyGridAdapter
import com.example.tp03.R

class ShopFragment : Fragment(R.layout.fragment_shop) {
    // 추가적인 동작이나 UI 설정이 필요하면 onViewCreated나 다른 메서드를 사용합니다.
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val gridView: GridView = view.findViewById(R.id.gridView)
        val gAdapter = MyGridAdapter(requireContext())
        gridView.adapter = gAdapter

    }
}
