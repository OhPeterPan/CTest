package com.example.c.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.c.Facer;
import com.example.c.R;

public class HelloActivity extends AppCompatActivity {
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_hello);

        TextView tv = findViewById(R.id.HelloText);
        tv.setText(stringFromJni());
    }

    public static native String stringFromJni();
}
