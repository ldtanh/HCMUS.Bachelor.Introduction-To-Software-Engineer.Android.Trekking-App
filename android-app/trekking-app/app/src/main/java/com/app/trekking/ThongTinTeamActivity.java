package com.app.trekking;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.septa.storemap.R;

/**
 * Created by taipham on 28/04/2018.
 */

public class ThongTinTeamActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongtinteam);
        getSupportActionBar().setTitle("Thông tin nhà phát triển");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
