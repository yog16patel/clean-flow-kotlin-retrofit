package com.yg.model.di

import android.app.Application
import com.yg.model.network.BoredAPI
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [
        RepositoryModule::class,
        NetworkModule::class
    ]
)
@Singleton
interface DomainComponent : ModelComponent {

    fun getGeetaAPI(): BoredAPI

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance application: Application) : DomainComponent
    }
}