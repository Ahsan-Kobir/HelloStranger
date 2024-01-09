package com.akapps.hellostranger.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.akapps.hellostranger.databinding.ActivityDashboardBinding

class DashboardActivity : AppCompatActivity() {

    private lateinit var views : ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        views = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(views.root)
    }
}