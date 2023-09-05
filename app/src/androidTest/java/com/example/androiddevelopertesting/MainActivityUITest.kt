package com.example.androiddevelopertesting

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import org.junit.After
import org.junit.Rule
import org.junit.Test
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent
import org.junit.Before

class MainActivityUITest {

    @Rule
    @JvmField
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Before
    fun setup() {
        // Initialize Espresso Intents
        Intents.init()
    }
    @Test
    fun testButtonClickAndIntent() {
        // Click the button with the specified ID
        onView(withId(R.id.startClick)).perform(click())

        // Verify that SecondActivity is opened
        Intents.intended(hasComponent(SecondActivity::class.java.name))
    }

    @After
    fun cleanup() {
        // Release Espresso Intents
        Intents.release()
    }
}