package com.example.testci

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun plus_isCorrect() {
        assertEquals(1, 1 * 1)
    }

    @Test
    fun less_isCorrect() {
        assertEquals(1, 2 - 1)
    }
}
