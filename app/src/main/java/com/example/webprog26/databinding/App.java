package com.example.webprog26.databinding;

import android.app.Application;
import android.content.Context;

/**
 * Created by webprog26 on 11.04.18.
 */

public class App extends Application {

    private static Context mAppContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppContext = this;
    }

    public static Context getAppContext() {
        return mAppContext;
    }
}
