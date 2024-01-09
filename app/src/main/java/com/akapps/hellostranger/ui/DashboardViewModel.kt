package com.akapps.hellostranger.ui

import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {
    private var count = 0;
    fun getCount() = count
    fun increase() = count++
}