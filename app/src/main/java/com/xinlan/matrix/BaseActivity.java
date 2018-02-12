package com.xinlan.matrix;

import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by panyi on 2018/2/12.
 */

public class BaseActivity extends AppCompatActivity {
    //广告展示
    public void showAd(){
        AdView adView = (AdView) findViewById(R.id.adView);
        if(adView == null )
            return;

        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }
}//end class
