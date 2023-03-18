package com.example.pilkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pilkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        MainPresenter(MainView(this))
    }
}
