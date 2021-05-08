package com.example.lifecycleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("bbb", "onCreate2");

        Button btn = findViewById(R.id.btnback);
        btn.setOnClickListener(v -> finish());
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("bbb", "onStart2");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("bbb", "onResume2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("bbb", "onPause2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("bbb", "onStop2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("bbb", "onRestart2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("bbb", "onDestroy2");
    }
}