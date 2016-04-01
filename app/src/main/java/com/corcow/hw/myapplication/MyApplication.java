package com.corcow.hw.myapplication;

import android.app.Application;
import android.content.Context;

/**
 * Created by multimedia on 2016-04-01.
 */
public class MyApplication extends Application {
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    public static Context getContext() {
        return mContext;
    }
}
