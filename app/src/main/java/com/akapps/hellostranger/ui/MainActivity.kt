package com.akapps.hellostranger.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.akapps.hellostranger.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var views : ActivityMainBinding
    private lateinit var mainViewModel: DashboardViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        views = ActivityMainBinding.inflate(layoutInflater)
        setContentView(views.root)

        mainViewModel = ViewModelProvider(this).get(DashboardViewModel::class.java)
    }
}