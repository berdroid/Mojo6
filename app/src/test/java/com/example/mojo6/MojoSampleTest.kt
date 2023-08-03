package com.example.mojo6

import org.junit.Test

import org.junit.Assert.*

class MojoSampleTest {
    @Test
    fun sample_hasTemperature() {
        val sample = MojoSample(
            SensorValue(1001, 12.5),
            SensorValue(1003, 0.0), SensorValue(1007, MojoValue())
        )
        assertEquals(12.5, sample.temperature.value, 0.1)
        assertEquals(1001, sample.temperature.timeStamp)
    }

    @Test
    fun sample_hasSampleWeight() {
        val sample = MojoSample(
            SensorValue(1012, 12.5),
            SensorValue(1022, 5.0), SensorValue(1037, MojoValue())
        )
        assertEquals(5.0, sample.sampleWeight.value, 0.1)
        assertEquals(1022, sample.sampleWeight.timeStamp)
    }
}
