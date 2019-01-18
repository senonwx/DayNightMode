package com.senon.daynightmode;

import android.app.Application;
import android.support.v7.app.AppCompatDelegate;

public class App extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        //初始化共享参数工具
        PreferenceUtil.init(this);

        AppCompatDelegate.setDefaultNightMode(PreferenceUtil.getBoolean(PreferenceUtil.isNight,false)?
                AppCompatDelegate.MODE_NIGHT_YES:AppCompatDelegate.MODE_NIGHT_NO);
    }
}
