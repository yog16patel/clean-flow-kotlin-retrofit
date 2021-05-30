package com.yg.model.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.Reusable
import yg.android.domain.annotation.ApplicationContext

@Module
class DomainModule {
    @Provides
    @Reusable
    @ApplicationContext
    fun applicationContext(application: Application): Context {
        return application
    }
}