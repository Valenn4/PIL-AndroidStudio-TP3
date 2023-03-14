package com.example.pilkotlin.components

interface ComponentContract {
    interface Presenter {
        fun onClickButton(message: String)
    }

    interface View {
        fun setTitle(title: String)
    }

    interface Model {
        fun getMessageInput(text: String): String
        fun errorMessage(): String
    }
}
