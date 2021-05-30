package com.yg.geetagyan.di

import android.app.Activity
import android.content.Context
import com.yg.geetagyan.MainActivity
import com.yg.geetagyan.core.annotation.ActivityScope
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @Binds
    @ActivityScope
    internal abstract fun activityContext(activity : Activity) : Context

    @ActivityScope
    @ContributesAndroidInjector
    internal abstract fun mainActivity(): MainActivity

}