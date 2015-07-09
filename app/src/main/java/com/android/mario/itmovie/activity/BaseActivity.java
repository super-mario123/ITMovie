package com.android.mario.itmovie.activity;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 2015/7/9.
 */
public class BaseActivity extends AppCompatActivity {

    private Context context;

    private Application application;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getApplicationContext();
        application = this.getApplication();
    }
}
