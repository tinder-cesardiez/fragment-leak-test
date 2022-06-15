package com.tinder.android.playground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tinder.android.playground.ui.fragment.FirstFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, FirstFragment(), FirstFragment.TAG)
                    .commitNow()
        }
    }
}