package com.example.pilkotlin

import com.example.pilkotlin.components.ComponentContract
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.verify
import org.junit.Before
import org.junit.Test

internal class CustomPresenterTest {

    @MockK
    private lateinit var model: ComponentContract.Model
    @RelaxedMockK
    private lateinit var view: ComponentContract.View
    private lateinit var presenter: ComponentContract.Presenter

    @Before
    fun setUp() {
        MockKAnnotations.init(this)
        presenter = CustomPresenter(view, model)
    }

    @Test
    fun `user enter a text`() {
        every { model.getMessageInput("hello") } returns "The message is: hello"
        presenter.onClickButton("hello")
        verify { view.setTitle("The message is: hello") }
    }

    @Test
    fun `user not enter a text`(){
        every { model.getErrorMessage() } returns "Enter a message please"
        presenter.onClickButton("")
        verify { view.setTitle("Enter a message please") }
    }
}