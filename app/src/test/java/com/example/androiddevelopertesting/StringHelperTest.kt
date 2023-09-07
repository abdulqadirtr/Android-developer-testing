package com.example.androiddevelopertesting

import com.google.common.truth.Truth
import org.junit.Before
import org.junit.Test

internal class StringHelperTest {

    lateinit var stringHelper: StringHelper

    @Before
    fun setUp() {

        stringHelper = StringHelper()

    }

    @Test
    fun IsNumberPositive(){
        val result = stringHelper.isNumberPositive(2)
        Truth.assertThat(result).isEqualTo(true)
    }

    @Test
    fun checkPalindrome(){
        var text = "kik"
        val result = stringHelper.isNumberPalindrome(text)
        Truth.assertThat(result).isEqualTo(true)
    }

}