package com.example.laoxiangji.activity;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import laoxiangji.example.com.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.requestWindowFeature(getWindow().FEATURE_NO_TITLE);

        super.onCreate(savedInstanceState);

        super.setContentView(R.layout.activity_main);

        super.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);



    }

}