package com.example.androiddevelopertesting


import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class CalculatorTest {

    private lateinit var calculator: Calculator

    @Before
    fun setUp(){
        calculator = Calculator()
    }

    @Test
    fun add() {
        val a = 5
        val b = 5
        val result = calculator.add(a, b)

        assertThat(result).isEqualTo(10)
    }

    @Test
    fun sub() {
        val a = 5
        val b = 5
        val result = calculator.sub(a, b)

        assertThat(result).isEqualTo(0)
    }

   @Test
    fun multiply() {
       val a = 5.0
       val b = 5.0
       val result = calculator.multiply(a, b)

       /**
        * Floating-Point Precision:
        *
        * assertThat(result).isWithin(1e-6).of(25.0)
        *
        */
       assertThat(result).isEqualTo(25)
    }
}