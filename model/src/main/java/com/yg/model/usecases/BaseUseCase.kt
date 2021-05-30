package com.yg.model.usecases

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

abstract class BaseUseCase<Output>{
    fun execute(): Flow<Output>{
        return flow {
            emit(getValue())
        }.flowOn(Dispatchers.IO)
    }
    protected abstract suspend fun getValue() : Output
}