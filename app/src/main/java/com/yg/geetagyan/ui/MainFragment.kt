package com.yg.geetagyan.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.yg.geetagyan.R
import com.yg.geetagyan.core.BaseFragment
import com.yg.geetagyan.viewmodel.BoredViewModel
import com.yg.geetagyan.viewmodel.ViewModelFactory
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.coroutines.flow.collect
import javax.inject.Inject

class MainFragment: BaseFragment() {

    private lateinit var viewModel: BoredViewModel
    @Inject
    internal lateinit var viewModelFactory: ViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_main, container, false)
        viewModel = ViewModelProvider(this, viewModelFactory)[BoredViewModel::class.java]
        lifecycleScope.launchWhenStarted {
            viewModel.uiObject.collect {
                keyTV.text = it.key
                participantsTV.text = it.participants.toString()
                activityTv.text = it.activity
            }
        }
        return root
    }


}