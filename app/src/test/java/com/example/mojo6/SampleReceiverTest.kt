package com.example.mojo6

import org.junit.Test

import org.junit.Assert.*

class SampleReceiverTest {
    private val rx = SampleReceiver()

    @Test
    fun receiver_isEmpty() {
        assertEquals(0, rx.numberOfSamples)
    }

    @Test
    fun receiver_hasLength() {
        rx.receiveTemperature(SensorValue(10023, 20.0))
        rx.addMojoSample(
            SensorValue(10035, 12.3),
            SensorValue(10038, MojoValue())
        )
        rx.addMojoSample(
            SensorValue(10277, 9.7),
            SensorValue(10281, MojoValue())
        )
        assertEquals(2, rx.numberOfSamples)
    }

    @Test
    fun receiver_hasAverageSampleWeight() {
        rx.receiveTemperature(SensorValue(10023, 20.0))
        rx.addMojoSample(
            SensorValue(10035, 12.3),
            SensorValue(10038, MojoValue())
        )
        rx.addMojoSample(
            SensorValue(10277, 9.7),
            SensorValue(10281, MojoValue())
        )
        rx.addMojoSample(
            SensorValue(10359, 10.7),
            SensorValue(10362, MojoValue())
        )
        rx.addMojoSample(
            SensorValue(10575, 11.2),
            SensorValue(10592, MojoValue())
        )

        assertEquals(10.975, rx.averageSampleWeight.value, 0.01)
        assertEquals(10035, rx.averageSampleWeight.timeStamp)
    }
}
