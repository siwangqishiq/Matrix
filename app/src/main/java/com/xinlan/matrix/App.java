package com.xinlan.matrix;

import android.app.Application;
import android.content.res.Configuration;

import com.google.android.gms.ads.MobileAds;

/**
 * Created by panyi on 2018/2/12.
 */

public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        //ca-app-pub-3940256099942544/6300978111 test
        //ca-app-pub-7854209777106622~3728361179 user
        MobileAds.initialize(this, "ca-app-pub-7854209777106622~3728361179");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }
}//end class
