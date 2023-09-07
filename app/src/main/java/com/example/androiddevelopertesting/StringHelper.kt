package com.example.androiddevelopertesting

class StringHelper {

    fun isNumberPositive(number : Int) : Boolean{
        return number > 0
    }

    fun isNumberPalindrome(text: String): Boolean? {

       return text.equals(text.reversed())
    }
}