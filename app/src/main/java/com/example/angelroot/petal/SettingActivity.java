package com.example.angelroot.petal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;


public class SettingActivity extends AppCompatActivity {
    private LinearLayout accountSet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.setting);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        initView();
        accountSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_as = new Intent(SettingActivity.this, AccountsActivity.class);
                startActivity(intent_as);
            }
        });
    }
    //初始化
    private void initView() {
        accountSet = (LinearLayout) findViewById(R.id.accout_set);
    }
}
