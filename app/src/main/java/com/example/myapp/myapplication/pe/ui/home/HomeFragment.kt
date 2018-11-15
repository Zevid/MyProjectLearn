package com.example.myapp.myapplication.pe.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapp.myapplication.R
import com.example.myapp.myapplication.pe.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment: BaseFragment() {
    override fun inflateContentView(inflater: LayoutInflater, container: ViewGroup): View {
        return inflater.inflate(R.layout.fragment_home, null)
    }

    override fun initUi() {
        tv_fragment_home.text="我是测试测试测从而达到"
    }

    override fun setListener() {
    }

    override fun initData() {
    }

}