package com.example.myapp.myapplication.pe.callback;

public class CallbackUtils {
    private static TextCallbackIntent callbackIntent;
    public static void setCallbackIntent(TextCallbackIntent textCallbackIntent){
        callbackIntent=textCallbackIntent;
    }
    public static void doCallbackIntent(){
        String info = "这里CallBackUtils即将发送的数据。";
        callbackIntent.doSomeThing(info);

    }
}
