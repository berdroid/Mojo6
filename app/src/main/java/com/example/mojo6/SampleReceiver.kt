package com.example.mojo6

class SampleReceiver {
    private var currentTemperature = SensorValue(0, 0.0)

    private var samples = mutableListOf<MojoSample>()

    private var calc = MojoCalculation(listOf())

    fun receiveTemperature(temp: SensorValue<Double>) {
        currentTemperature = temp
    }

    fun addMojoSample(weight: SensorValue<Double>, mojo: SensorValue<MojoValue>) {
        samples.add(MojoSample(currentTemperature, weight, mojo))
        calc = MojoCalculation(samples)
    }

    val numberOfSamples: Int
        get() = samples.size
    
    val averageSampleWeight: SensorValue<Double>
        get() = calc.averageSampleWeight
}
