package com.example.launcheractivity

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SouthActivityTest {

    private lateinit var scenario: ActivityScenario<SouthActivity>

    @Before
    fun setUp() {
        scenario = ActivityScenario.launch(SouthActivity::class.java)
    }

    @After
    fun tearDown() {
        scenario.close()
    }

    @Test
    fun showsSouthTextOnLaunch() {
        onView(withId(R.id.southTitle)).check(matches(withText("South")))
    }
}