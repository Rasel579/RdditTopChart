package com.teck.reddittopchart.presenter.main

import by.kirich1409.viewbindingdelegate.viewBinding
import com.teck.reddittopchart.R
import com.teck.reddittopchart.databinding.MainFragmentBinding
import com.teck.reddittopchart.domain.AppState
import com.teck.reddittopchart.presenter.base.BaseFragment
import com.teck.reddittopchart.presenter.base.BaseViewModel
import org.koin.core.scope.Scope

class MainFragment() : BaseFragment<MainFragmentBinding>(R.layout.main_fragment) {
    override val scope: Scope
        get() = TODO("Not yet implemented")
    override val viewBinding: MainFragmentBinding by viewBinding()
    override val viewModel: BaseViewModel = MainViewModel()
    override fun onStart() {
        viewModel.getLiveData().observe(viewLifecycleOwner) {
            renderData(it as AppState)
        }
        viewModel.getData()
        super.onStart()
    }

    override fun renderData(appState: AppState) {
        TODO("Not yet implemented")
    }

    companion object {
        fun newInstance() = MainFragment()
    }
}