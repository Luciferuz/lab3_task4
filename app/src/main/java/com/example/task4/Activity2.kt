package com.example.task4

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.task4.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {

    private lateinit var binding: Activity2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        binding.toFirst.setOnClickListener { toFirstClick() }
        binding.toThird.setOnClickListener { toThirdClick() }
        binding.bottomNavigation.setOnNavigationItemSelectedListener { onAboutClick(it) }
        setContentView(binding.root)
    }

    private fun toFirstClick(){
        startActivity(Intent(this, Activity1::class.java).setFlags(FLAG_ACTIVITY_CLEAR_TOP))
    }

    private fun toThirdClick(){
        startActivity(Intent(this, Activity3::class.java))
    }

    private fun onAboutClick(menuItem: MenuItem) : Boolean {
        when (menuItem.itemId) {
            R.id.to_about -> {
                startActivity(Intent(this, ActivityAbout::class.java))
            }
        }
        return false
    }
}