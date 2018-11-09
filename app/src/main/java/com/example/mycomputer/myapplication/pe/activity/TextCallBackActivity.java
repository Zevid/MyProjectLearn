package com.example.mycomputer.myapplication.pe.activity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.mycomputer.myapplication.R;
import com.example.mycomputer.myapplication.pe.callback.CallbackUtils;
import com.example.mycomputer.myapplication.pe.callback.TextCallbackIntent;

public class TextCallBackActivity extends BaseActivityA implements TextCallbackIntent{
    private Button button;
    private ImageView imageView;
    @Override
    public int intiLayout() {
        return R.layout.activity_text_callback;
    }

    @Override
    public void initView() {
        button=findViewById(R.id.text_callback_bt);
        imageView=findViewById(R.id.text_callback_iv);

    }

    @Override
    public void initData() {
        button.setOnClickListener(listener);
        CallbackUtils.setCallbackIntent(this);

    }
    private View.OnClickListener listener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            CallbackUtils.doCallbackIntent();

        }
    };

    @Override
    public void doSomeThing(String string) {
        Log.e("测试计划===",string);

    }
}
