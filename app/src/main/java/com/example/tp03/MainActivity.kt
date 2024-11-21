package com.example.tp03

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.main_bottomnavgation)

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.profile -> {
                    // Handle Home button
                    true
                }
                R.id.shop -> {
                    // Handle Shop button
                    true
                }
                R.id.apps -> {
                    // Handle Apps button
                    true
                }
                else -> false
            }
        }
        val toolbar = findViewById<Toolbar>(R.id.main_toolbar)
        setSupportActionBar(toolbar)
    }

    // Toolbar에 메뉴 추가
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar, menu)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        return true
    }

    // 메뉴 클릭 이벤트 (현재는 비워둠)
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.notice_button -> {
                // 버튼 클릭 시 동작 (현재 비워둠)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
