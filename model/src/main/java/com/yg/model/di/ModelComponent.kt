package com.yg.model.di

import com.yg.model.repository.BoredRepository
import dagger.Component

@Component
interface ModelComponent {
    fun getGeetaRepository(): BoredRepository
}