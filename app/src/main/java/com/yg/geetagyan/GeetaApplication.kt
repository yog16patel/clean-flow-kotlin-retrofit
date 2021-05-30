package com.yg.geetagyan

import android.app.Application
import com.yg.geetagyan.di.DaggerAppComponent
import com.yg.model.di.DaggerDomainComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class GeetaApplication : Application(), HasAndroidInjector {

    @Inject
    internal lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.factory().create(
            this,
            DaggerDomainComponent.factory().create(this)
        )
            .inject(this)
    }


    override fun androidInjector(): AndroidInjector<Any> {
        return dispatchingAndroidInjector
    }
}