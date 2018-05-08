package com.example.trant.lam_components;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_app);
    }

    public void startApp(View view) {
//        System.out.print("Lam");
        Log.d("Lam", "Lam");
        setContentView(R.layout.another_main);
    }
}
