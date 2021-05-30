package com.yg.geetagyan.models

data class BoredUI(
    val activity: String,
    val type: String,
    val participants: Int,
    val price: Double,
    val link: String,
    val key: String,
    val accessibility: Double
) {
    companion object {
        val INVALID_VALUE = BoredUI("", "", 0, 0.0, "", "", 0.0)
    }
}