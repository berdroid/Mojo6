package com.example.mojo6

import org.junit.Test

import org.junit.Assert.*
import java.util.Date

class MojoCalculationTest {
    private val samples = arrayOf(
        MojoSample(10034, 23.5, 12.3, MojoValue()),
        MojoSample(10276, 21.3, 9.7, MojoValue()),
        MojoSample(10356, 20.7, 10.7, MojoValue()),
        MojoSample(10572, 23.1, 11.2, MojoValue()),
    )

    private val calc = MojoCalculation(samples)

    @Test
    fun calc_hasLength() {
        assertEquals(4, calc.numberOfSamples)
    }

    @Test
    fun calc_hasAverageWeight() {
        assertEquals(10.975, calc.averageSampleWeight, 0.01)
    }

    @Test
    fun calc_hasEarliestTimeStamp() {
        assertEquals(10034, calc.earliestTimeStamp)
    }
}
