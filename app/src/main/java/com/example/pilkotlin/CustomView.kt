package com.example.pilkotlin

import android.app.Activity
import android.widget.Toast
import com.example.pilkotlin.components.ComponentContract
import com.example.pilkotlin.databinding.ActivityMainBinding

class CustomView(private var activity: Activity) : ComponentContract.View {

    private var binding: ActivityMainBinding = ActivityMainBinding.inflate(activity.layoutInflater)

    override fun setTitle(title: String) {
        Toast.makeText(activity, title, Toast.LENGTH_SHORT).show()
    }
}
