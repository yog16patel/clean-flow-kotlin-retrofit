package com.yg.model.repository

import com.yg.model.entity.Bored
import kotlinx.coroutines.flow.Flow

interface BoredRepository {
    suspend fun getBored() : Bored
}