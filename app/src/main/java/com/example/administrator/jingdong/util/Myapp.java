package com.example.administrator.jingdong.util;

import android.app.Application;
import android.content.Context;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.mob.MobSDK;



public class Myapp extends Application {
    public static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        MobSDK.init(this);
        context=getApplicationContext();
        Fresco.initialize(this);
        GreenDaoUtils.getmInstance().init();

    }
}
