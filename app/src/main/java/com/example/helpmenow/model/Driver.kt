package com.example.helpmenow.model

/**
 *  @param ambulanceLocation will hold Latitude and Longitude ex. [123123.45,456456.45].
 */
data class Driver(
    val driverInfo: Person,
    val ambulanceLocation: List<Float>,
    val onDuty: Boolean,
    val enRoute: Boolean
)
