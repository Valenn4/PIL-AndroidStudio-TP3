package com.example.pilkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pilkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var presenter: CustomPresenter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        presenter = CustomPresenter(CustomView(this), CustomModel())

        binding.buttonShowText.setOnClickListener {
            presenter.onClickButton(binding.inputText.text.toString())
        }
    }
}
