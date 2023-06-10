package com.yooni.newsletter.type

enum class YesNoType {
    Y, N;

    fun convertToBoolean(): Boolean {
        return this == Y
    }
}