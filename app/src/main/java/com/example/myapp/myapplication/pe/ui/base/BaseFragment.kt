package com.example.myapp.myapplication.pe.ui.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

abstract class BaseFragment : Fragment() {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initUi()
        initData()
        setListener()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflateContentView(inflater, container!!)
    }

    abstract fun inflateContentView(inflater: LayoutInflater, container: ViewGroup): View

    abstract fun initUi()

    abstract fun setListener()

    abstract fun initData()
}