package com.example.pilkotlin

import com.example.pilkotlin.MainContract
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.verify
import org.junit.Before
import org.junit.Test

class MainPresenterTest {

    @RelaxedMockK
    private lateinit var view: MainContract.View
    private lateinit var presenter: MainContract.Presenter

    @Before
    fun setUp() {
        MockKAnnotations.init(this)
        presenter = MainPresenter(view)
    }

    @Test
    fun `user enter a text`() {
        every { view.getMessageInput() } returns "hello"
        presenter.onClickButton()
        verify { view.showMessage() }
    }

    @Test
    fun `user not enter a text`(){
        every { view.getMessageInput() } returns ""
        presenter.onClickButton()
        verify { view.showError() }
    }
}