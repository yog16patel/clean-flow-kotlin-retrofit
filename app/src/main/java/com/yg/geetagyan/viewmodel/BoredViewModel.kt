package com.yg.geetagyan.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yg.geetagyan.models.BoredUI
import com.yg.model.entity.Bored
import com.yg.model.repository.BoredRepository
import com.yg.model.usecases.GetChaptersUseCase
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@ExperimentalCoroutinesApi
class BoredViewModel @Inject constructor(
    private val boredRepository: GetChaptersUseCase
) : ViewModel() {

    private val _uiObject = MutableStateFlow(BoredUI.INVALID_VALUE)
    val uiObject: StateFlow<BoredUI> = _uiObject

    init {
        viewModelScope.launch {
            boredRepository.execute()
                .collect {
                    Log.e("Yogesh: ","Data : $it")
                    _uiObject.value = it.convert()
                    val t = _uiObject.value
                }
        }
    }

    private fun Bored.convert() = BoredUI(
            activity,
            type,
            participants,
            price,
            link,
            key,
            accessibility,
        )
}