package com.yg.geetagyan.di

import com.yg.geetagyan.core.annotation.FragmentScope
import com.yg.geetagyan.ui.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @FragmentScope
    @ContributesAndroidInjector
    abstract fun mainFragmentModuleInjector() : MainFragment

}