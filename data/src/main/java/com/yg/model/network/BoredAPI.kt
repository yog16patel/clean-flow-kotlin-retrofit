package com.yg.model.network

import com.yg.model.entity.*
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET

interface BoredAPI {
    @GET("api/activity")
    suspend fun getBored(): Bored
}