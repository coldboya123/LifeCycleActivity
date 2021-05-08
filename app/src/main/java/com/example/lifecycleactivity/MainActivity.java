package com.example.lifecycleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("bbb", "onCreate");

        TextView txt = findViewById(R.id.btn);
        txt.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, SecondActivity.class));
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("bbb", "onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("bbb", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("bbb", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("bbb", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("bbb", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("bbb", "onDestroy");
    }
}