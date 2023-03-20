package com.example.pilkotlin

interface MainContract {
    interface Presenter {
        fun onClickButton()
    }

    interface View {
        fun showMessage(message: String)
        fun showError()
        fun clickButton(function: () -> Unit)
        fun getMessageInput(): String
    }

}
