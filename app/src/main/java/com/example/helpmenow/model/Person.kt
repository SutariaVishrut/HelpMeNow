package com.example.helpmenow.model

/**
 * @param identificationNumber we get from backend to identify if the user is the correct one as people can have same name.
 *
 */
data class Person(
    val identificationNumber: Long,
    val name: String
)
