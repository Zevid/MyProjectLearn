package com.example.mycomputer.myapplication.pe.activity

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import com.example.mycomputer.myapplication.R
import com.example.mycomputer.myapplication.pe.fragment.HomeFragment
import com.example.mycomputer.myapplication.pe.ui.adapter.TabFragmentPagerAdapter
import kotlinx.android.synthetic.main.activity_display_message.*
import java.util.*
import kotlin.collections.ArrayList

class DisplayMessageActivity : BaseActivity() {
    private var fragmentPagerAdapter: TabFragmentPagerAdapter? = null


    override fun initListener() {
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    override fun intiLayout(): Int {
        return R.layout.activity_display_message
    }


    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                viewpage_home.currentItem = 0
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                viewpage_home.currentItem = 1
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                viewpage_home.currentItem = 2
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

    }

    /******
     * 初始化view
     */
    override fun initView() {
        setTitleText()
        setViewpage()


    }

    private fun setTitleText() {
        val mActionBar = supportActionBar
        mActionBar!!.setHomeButtonEnabled(true)
        mActionBar.setDisplayHomeAsUpEnabled(true)
        mActionBar.title = "修改菜品分类"
    }

    private fun setViewpage() {
        val fragmentlist: MutableList<Fragment>? = ArrayList()
        if (fragmentlist != null) {
            fragmentlist.add(HomeFragment())
            fragmentlist.add(HomeFragment())
            fragmentlist.add(HomeFragment())
        }
        fragmentPagerAdapter = TabFragmentPagerAdapter(supportFragmentManager, fragmentlist!!)
        viewpage_home.adapter = fragmentPagerAdapter
        viewpage_home.currentItem = 0  //初始化显示第一个页面
    }

    /******
     * 初始化数据
     */
    override fun initData() {

    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }


}
