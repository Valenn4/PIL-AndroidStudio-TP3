package com.example.pilkotlin

class MainPresenter(private var view: MainContract.View): MainContract.Presenter {
    init {
        view.clickButton { onClickButton() }
    }
    override fun onClickButton() {
        val message = view.getMessageInput()
        if(message.isEmpty()){
            view.showError()
        } else {view.showMessage(message)}
    }
}