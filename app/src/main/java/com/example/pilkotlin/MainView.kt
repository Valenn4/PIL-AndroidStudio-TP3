package com.example.pilkotlin

import android.app.Activity
import android.widget.Toast
import com.example.pilkotlin.databinding.ActivityMainBinding

class MainView(activity: Activity) : ActivityView(activity), MainContract.View {
    private var binding: ActivityMainBinding = ActivityMainBinding.inflate(activity.layoutInflater)
    init {
        activity.setContentView(binding.root)
    }

    override fun getMessageInput(): String {
        return binding.inputText.text.toString()
    }
    override fun showMessage(message: String) {
        Toast.makeText(activity, message, Toast.LENGTH_SHORT).show()
    }

    override fun showError() {
        Toast.makeText(activity, activity?.resources?.getString(R.string.message_error), Toast.LENGTH_SHORT).show()
    }

    override fun clickButton(function: () -> Unit) {
        binding.buttonShowText.setOnClickListener { function() }
    }
}
