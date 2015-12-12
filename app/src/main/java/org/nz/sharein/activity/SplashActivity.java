package org.nz.sharein.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.os.Handler;

import org.nz.sharein.R;


/**
 * Created by chenzm on 2015/12/10.
 */
public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        enterHomeActivity();
    }

    private void initView() {
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
    }

    private void enterHomeActivity() {
        new Handler().postDelayed(new Runnable() {
            public void run() {
                Intent mainIntent = new Intent(SplashActivity.this,
                        MainActivity.class);
                startActivity(mainIntent);
                System.out.println("启动页面退出");
                finish();
            }
        }, 1000);
    }
}
