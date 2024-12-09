package com.example.tp03

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MyGridAdapter(private val context: Context) : BaseAdapter() {

    private val imageList = arrayOf(
        R.drawable.refee_ic, R.drawable.refee_ic, R.drawable.refee_ic, // 이미지 리소스
        R.drawable.refee_ic, R.drawable.refee_ic, R.drawable.refee_ic ,
        R.drawable.refee_ic, R.drawable.refee_ic, R.drawable.refee_ic, // 이미지 리소스
        R.drawable.refee_ic, R.drawable.refee_ic, R.drawable.refee_ic
    )

    private val textList = arrayOf(
        "아이템 1", "아이템 2", "아이템 3", "아이템 4", "아이템 5", "아이템 6",
        "아이템 7", "아이템 8", "아이템 9", "아이템 10", "아이템 11", "아이템 12"
    )

    override fun getCount(): Int {
        return imageList.size
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = convertView
        if (view == null) {
            // view가 없으면 새로 생성
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(R.layout.grid_item, parent, false)
        }

        // 이미지와 텍스트 설정
        val imageView: ImageView = view!!.findViewById(R.id.gridImage)
        val textView: TextView = view.findViewById(R.id.gridText)

        imageView.setImageResource(imageList[position])  // 이미지 설정
        textView.text = textList[position]               // 텍스트 설정

        return view
    }
}
