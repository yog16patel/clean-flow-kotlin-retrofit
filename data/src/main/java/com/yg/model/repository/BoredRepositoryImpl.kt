package com.yg.model.repository

import com.yg.model.entity.Bored
import com.yg.model.network.BoredAPI
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

@ExperimentalCoroutinesApi
class BoredRepositoryImpl @Inject constructor(
    private val boredAPI: BoredAPI
) : BoredRepository {
    override  suspend fun getBored(): Bored {
      return boredAPI.getBored()
    }


}