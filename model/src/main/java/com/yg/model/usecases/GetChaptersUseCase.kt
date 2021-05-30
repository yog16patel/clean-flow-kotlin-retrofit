package com.yg.model.usecases

import com.yg.model.entity.Bored
import com.yg.model.repository.BoredRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class GetChaptersUseCase @Inject constructor(
    private val repository: BoredRepository
): BaseUseCase<Bored>() {
    override suspend fun getValue(): Bored {
       return repository.getBored()
    }
}