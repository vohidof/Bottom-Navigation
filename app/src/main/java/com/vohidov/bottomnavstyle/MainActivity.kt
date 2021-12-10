package com.vohidov.bottomnavstyle

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import com.vohidov.bottomnavstyle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        setUpTabBar()
    }

    @SuppressLint("SetTextI18n")
    private fun setUpTabBar() {
        binding.bottomNavBar.setOnItemSelectedListener {
            when(it){
                R.id.nav_home ->{
                    binding.textMain.text = "Home"
                }
                R.id.nav_search ->{
                    binding.textMain.text = "Search"
                }
                R.id.nav_like ->{
                    binding.textMain.text = "Like"
                }
                R.id.nav_profile ->{
                    binding.textMain.text = "Profile"
                }
            }
        }
    }
}