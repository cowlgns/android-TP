package com.example.tp03.fragments

import android.app.Dialog
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.tp03.R

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Post 버튼 클릭 리스너 설정
        val postButton: Button = view.findViewById(R.id.btn_post)
        postButton.setOnClickListener {
            showCustomPopup()
        }
    }

    private fun showCustomPopup() {
        // Dialog 생성
        val dialog = Dialog(requireContext())
        dialog.setContentView(R.layout.popup_post)
        dialog.window!!.setBackgroundDrawableResource(android.R.color.transparent)

        // 팝업 크기 설정
        val window = dialog.window
        if (window != null) {
            val layoutParams = window.attributes
            layoutParams.width = (resources.displayMetrics.widthPixels * 0.9).toInt() // 화면 너비의 90%
            layoutParams.height = (resources.displayMetrics.heightPixels * 0.8).toInt() // 화면 높이의 70%
            window.attributes = layoutParams
        }

        // Dialog 내부 요소 설정
        val btnClose = dialog.findViewById<ImageButton>(R.id.btn_close_profile)
        val popupContent = dialog.findViewById<TextView>(R.id.popup_content_profile)
        val btnLike = dialog.findViewById<Button>(R.id.btn_save)
        val btnMessage = dialog.findViewById<Button>(R.id.btn_post_popup)

        // 이벤트 처리
        btnClose.setOnClickListener {
            dialog.dismiss() // 팝업 닫기
        }
        btnLike.setOnClickListener {
            popupContent.text = "SAVE"
        }
        btnMessage.setOnClickListener {
            popupContent.text = "POST"
        }

        // 팝업 띄우기
        dialog.show()
    }
}
