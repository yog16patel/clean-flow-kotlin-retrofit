package com.yg.model.di

import com.yg.model.repository.BoredRepositoryImpl
import com.yg.model.repository.BoredRepository
import dagger.Binds
import dagger.Module
import dagger.Reusable
import kotlinx.coroutines.ExperimentalCoroutinesApi

@Module
abstract class RepositoryModule {

    @ExperimentalCoroutinesApi
    @Binds
    @Reusable
    internal abstract fun bindGeetaRepository(geetaRepository: BoredRepositoryImpl) : BoredRepository

}