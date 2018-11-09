package com.example.mycomputer.myapplication.pe.ui.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter


class TabFragmentPagerAdapter(fragmetnmanager: FragmentManager  //创建FragmentManager
                              , private val mfragmentList: List<Fragment>) : FragmentPagerAdapter(fragmetnmanager) {

    override fun getItem(arg0: Int): Fragment {
        // TODO Auto-generated method stub
        return mfragmentList[arg0] //返回第几个fragment
    }

    override fun getCount(): Int {
        // TODO Auto-generated method stub
        return mfragmentList.size //总共有多少个fragment
    }


}
