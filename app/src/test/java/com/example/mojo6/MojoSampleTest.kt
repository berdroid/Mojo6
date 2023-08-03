package com.example.mojo6

import org.junit.Test

import org.junit.Assert.*

class MojoSampleTest {
    @Test
    fun sample_hasTemperature() {
        val sample: MojoSample = MojoSample(1001, 12.5, 0.0, MojoValue())
        assertEquals(12.5, sample.temperature, 0.1)
    }

    @Test
    fun sample_hasSampleWeight() {
        val sample: MojoSample = MojoSample(1012, 12.5, 5.0, MojoValue())
        assertEquals(5.0, sample.sampleWeight, 0.1)
    }

    @Test
    fun sample_hasTimeStamp() {
        val sample: MojoSample = MojoSample(1023, 12.5, 5.0, MojoValue())
        assertEquals(1023, sample.timeStamp)
    }
}
