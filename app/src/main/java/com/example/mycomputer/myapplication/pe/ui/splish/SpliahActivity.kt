package com.example.mycomputer.myapplication.pe.ui.splish

import android.content.Intent
import com.example.mycomputer.myapplication.R
import com.example.mycomputer.myapplication.pe.activity.BaseActivity
import com.example.mycomputer.myapplication.pe.activity.DisplayMessageActivity
import kotlinx.android.synthetic.main.activity_splish.*
import java.util.*


class SpliahActivity : BaseActivity() {
    override fun intiTitle(): Int {
        return 2
    }

    override fun initListener() {
    }

    override fun intiLayout(): Int {
        return R.layout.activity_splish
    }

    override fun initView() {

    }

    override fun initData() {
        Timer().schedule(taskElse, 2000)//500秒后执行TimeTask的run方法

    }

    /******
     * 延时操作
     */
    val taskElse = object : TimerTask() {
        /**
         * 要执行的操作
         */
        override fun run() {
            startActivity(Intent(this@SpliahActivity, DisplayMessageActivity::class.java))
            finish()
        }
    }
}