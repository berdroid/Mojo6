package com.example.mojo6

class MojoCalculation(private val samples: Array<MojoSample>) {

    val numberOfSamples: Int
        get() = samples.size

    val averageSampleWeight: Double
        get() = samples.map { it.sampleWeight }.average()

    val earliestTimeStamp: Long
        get() = samples.minOf { it.timeStamp }
}
