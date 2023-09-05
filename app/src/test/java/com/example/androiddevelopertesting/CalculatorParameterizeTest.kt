package com.example.androiddevelopertesting


import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class CalculatorParameterizeTest(private val a: Int, private val b: Int, private val expectedAdd: Int, private val expectedSub: Int) {

    private lateinit var calculator: Calculator

    @Before
    fun setUp(){
        calculator = Calculator()
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data(): Collection<Array<Any>> {
            return listOf(
                arrayOf(2, 3, 5,-1),
                arrayOf(6, 2, 8,4),
                arrayOf(3, 1, 4,2)
            )
        }
    }

    @Test
    fun testAdd() {
        val result = calculator.add(a, b)
        assertEquals(expectedAdd, result)
    }

    @Test
    fun testSubtract() {
        val result = calculator.sub(a, b)
        assertEquals(expectedSub, result)
    }
}