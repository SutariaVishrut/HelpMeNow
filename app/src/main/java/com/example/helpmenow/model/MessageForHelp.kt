package com.example.helpmenow.model

/**
 * @param emergencyLocation will hold Latitude and Longitude ex. [123123.45,456456.45].
 */
data class MessageForHelp(
    val user: Person,
    val description: String,
    val emergencyLocation: List<Float>
)
