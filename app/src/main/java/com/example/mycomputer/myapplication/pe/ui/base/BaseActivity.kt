package com.example.mycomputer.myapplication.pe.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

abstract class BaseActivity : AppCompatActivity() {
    /***获取TAG的activity名称 */
    protected val TAG = this.javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        //设置布局
        setContentView(intiLayout())
        super.onCreate(savedInstanceState)

        //初始化控件
        initView()
        //设置数据
        initData()
        //设置响应事件
        initListener()
    }

    /**
     * 设置布局
     *
     * @return
     */
    abstract fun intiLayout(): Int

    /**
     * 初始化布局
     */
    abstract fun initView()

    /**
     * 设置数据
     */
    abstract fun initData()

    /**
     * 设置响应事件
     */
    abstract fun initListener()


    /**
     * 显示长toast
     * @param msg
     */
    fun toastLong(msg: String) {
        if (null == toast) {
            toast = Toast(this)
            toast!!.duration = Toast.LENGTH_LONG
            toast!!.setText(msg)
            toast!!.show()
        } else {
            toast!!.setText(msg)
            toast!!.show()
        }
    }

    /**
     * 显示短toast
     * @param msg
     */
    fun toastShort(msg: String) {
        if (null == toast) {
            toast = Toast(this)
            toast!!.duration = Toast.LENGTH_SHORT
            toast!!.setText(msg)
            toast!!.show()
        } else {
            toast!!.setText(msg)
            toast!!.show()
        }
    }

    companion object {
        /***封装toast对象 */
        private var toast: Toast? = null
    }

}
