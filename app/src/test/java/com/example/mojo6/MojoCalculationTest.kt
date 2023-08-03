package com.example.mojo6

import org.junit.Test

import org.junit.Assert.*

class MojoCalculationTest {
    private val samples = arrayOf(
        MojoSample(
            SensorValue(10034, 23.5),
            SensorValue(10035, 12.3),
            SensorValue(10038, MojoValue())
        ),
        MojoSample(
            SensorValue(10276, 21.3),
            SensorValue(10277, 9.7),
            SensorValue(10281, MojoValue())
        ),
        MojoSample(
            SensorValue(10356, 20.7),
            SensorValue(10359, 10.7),
            SensorValue(10362, MojoValue())
        ),
        MojoSample(
            SensorValue(10572, 23.1),
            SensorValue(10575, 11.2),
            SensorValue(10592, MojoValue())
        ),
    )

    private val calc = MojoCalculation(samples)

    @Test
    fun calc_hasLength() {
        assertEquals(4, calc.numberOfSamples)
    }

    @Test
    fun calc_hasAverageWeight() {
        assertEquals(10.975, calc.averageSampleWeight.value, 0.01)
    }

    @Test
    fun calc_hasEarliestTimeStamp() {
        assertEquals(10035, calc.averageSampleWeight.timeStamp)
    }
}
