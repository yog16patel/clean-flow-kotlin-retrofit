package com.yg.geetagyan.di

import com.yg.geetagyan.GeetaApplication
import com.yg.geetagyan.core.annotation.PresentationScope
import com.yg.model.di.DomainComponent
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@PresentationScope
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityModule::class,
        FragmentModule::class,
        ViewModelModule::class
    ],
    dependencies = [
        DomainComponent::class
    ]
)
interface AppComponent : AndroidInjector<GeetaApplication> {

    @Component.Factory
    interface Factory{
        fun create(
            @BindsInstance application: GeetaApplication,
            domainComponent: DomainComponent
        ) : AppComponent
    }
}