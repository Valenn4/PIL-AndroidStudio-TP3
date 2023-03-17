package com.example.pilkotlin

import com.example.pilkotlin.components.ComponentContract
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class CustomModelTest {

    private lateinit var model : ComponentContract.Model

    @Before
    fun setUp() {
        model = CustomModel()
    }

    @Test
    fun getMessageInput() {
        var result = model.getMessageInput("hello")
        Assert.assertEquals("The message is: hello", result)
    }

    @Test
    fun getErrorMessage() {
        var result = model.getErrorMessage()
        Assert.assertEquals("Enter a message please", result)
    }
}