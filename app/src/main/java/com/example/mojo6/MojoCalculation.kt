package com.example.mojo6

class MojoCalculation(private val samples: Array<MojoSample>) {

    val numberOfSamples: Int
        get() = samples.size

    val averageSampleWeight: SensorValue<Double>
        get() = SensorValue(
            samples.minOf { it.sampleWeight.timeStamp },
            samples.map { it.sampleWeight.value }.average()
        )
}
