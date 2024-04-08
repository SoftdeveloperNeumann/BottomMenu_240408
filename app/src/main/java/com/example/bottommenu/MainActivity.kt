package com.example.bottommenu

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.bottommenu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomBar.setOnItemSelectedListener { item:MenuItem ->

            val fragment = when(item.itemId){
                R.id.action_home -> HomeFragment()

                else -> Fragment()
            }

            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(binding.fragmentContainerView.id,fragment)
            transaction.commit()

            true
        }

    }
}