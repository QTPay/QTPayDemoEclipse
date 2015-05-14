package com.example.qianfangdemo.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import qfpay.wxshop.R;

public class SelectActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        View view_qt = findViewById(R.id.qt);
        View view_qpos = findViewById(R.id.qpos);

        view_qpos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectActivity.this , GoodsListActivity.class));
            }
        });

        view_qt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectActivity.this, MainActivity.class));
            }
        });
    }
}
