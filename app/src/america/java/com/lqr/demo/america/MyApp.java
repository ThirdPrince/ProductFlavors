package com.lqr.demo.america;

import android.app.Application;
import android.util.Log;

class MyApp extends Application {
    private static final String TAG = "MyApp";
    @Override
    public void onCreate() {
        super.onCreate();
        Log.e(TAG,"MyApp");
    }
}
