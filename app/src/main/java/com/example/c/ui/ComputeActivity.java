package com.example.c.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.c.R;

public class ComputeActivity extends AppCompatActivity {
    static {
        System.loadLibrary("compute-lib");
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_compute);

        TextView tv = findViewById(R.id.ComputeText);
        tv.setText(String.format("来自C++代码计算:%d",computer(3,6)));
    }


    public static native int computer(int a,int b);

}
