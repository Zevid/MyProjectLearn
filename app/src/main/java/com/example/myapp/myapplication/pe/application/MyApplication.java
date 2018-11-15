package com.example.myapp.myapplication.pe.application;

import android.app.Application;
import android.content.Context;

public class MyApplication extends Application {
    private static Context context;

    private static MyApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        context=getApplicationContext();
    }

    /****
     * context
     * @return
     */
    public static Context getContext(){
     return context;
    }
    public static MyApplication getInstance(){
        return instance;
    }


}
