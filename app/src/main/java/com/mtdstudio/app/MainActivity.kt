package com.mtdstudio.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_nav)
        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_main -> {
                    supportFragmentManager.commit {
                        replace(R.id.fragment_container, MainFragment())
                    }
                    true
                }
                R.id.nav_editor -> {
                    supportFragmentManager.commit {
                        replace(R.id.fragment_container, EditorFragment())
                    }
                    true
                }
                R.id.nav_github -> {
                    supportFragmentManager.commit {
                        replace(R.id.fragment_container, GithubFragment())
                    }
                    true
                }
                R.id.nav_build -> {
                    supportFragmentManager.commit {
                        replace(R.id.fragment_container, BuildFragment())
                    }
                    true
                }
                else -> false
            }
        }
        
        // Fragment default saat pertama dibuka
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                replace(R.id.fragment_container, MainFragment())
            }
        }
    }
}
