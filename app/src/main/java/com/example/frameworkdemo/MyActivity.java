package com.example.frameworkdemo;


import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;


public class MyActivity extends Activity {
    ImageView usedIv;
    ImageView reuseIv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usedIv = findViewById(R.id.iv_used);
        reuseIv = findViewById(R.id.iv_reuse);
        usedIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}
