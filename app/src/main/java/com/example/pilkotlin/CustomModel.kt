package com.example.pilkotlin

import com.example.pilkotlin.components.ComponentContract

class CustomModel() : ComponentContract.Model {

    override fun getMessageInput(text: String): String {
        return "The message is: $text"
    }

    override fun getErrorMessage(): String {
        return "Enter a message please"
    }
}
