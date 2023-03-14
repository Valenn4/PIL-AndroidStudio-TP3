package com.example.pilkotlin

import com.example.pilkotlin.components.ComponentContract

class CustomPresenter(private var customView: ComponentContract.View, private var customModel: ComponentContract.Model) : ComponentContract.Presenter {

    override fun onClickButton(message: String) {
        var text : String

        if(message.isEmpty()){
            text = customModel.errorMessage()
        } else {
            text = customModel.getMessageInput(message)
        }
        customView.setTitle(text)
    }
}
