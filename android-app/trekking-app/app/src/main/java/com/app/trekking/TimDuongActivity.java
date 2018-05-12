package com.app.trekking;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.septa.storemap.R;

/**
 * Created by septa on 4/11/2018.
 */

public class TimDuongActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timduong);
        getSupportActionBar().setTitle("Tìm đường đi");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
