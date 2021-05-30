package com.yg.geetagyan.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.yg.geetagyan.core.annotation.ViewModelKey
import com.yg.geetagyan.viewmodel.BoredViewModel
import com.yg.geetagyan.viewmodel.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    internal abstract fun viewModelFactory (viewModelFactory: ViewModelFactory) : ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(BoredViewModel::class)
    internal abstract fun mainViewModel(viewModel: BoredViewModel) : ViewModel

}