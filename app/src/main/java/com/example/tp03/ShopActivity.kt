package com.example.tp03

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class ShopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 배경색 빨간색으로 설정
        window.decorView.setBackgroundColor(resources.getColor(android.R.color.holo_red_light))

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.main_bottomnavgation)

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.profile -> {
                    val intent = Intent(this, ProfileActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.shop -> {
                    // 이미 ShopActivity에서 있기 때문에 다시 ShopActivity로 가는 처리는 필요없음
                    true
                }
                R.id.apps -> {
                    val intent = Intent(this, MainActivity::class.java)
                    intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP // MainActivity로 돌아가기
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
    }
}
