package com.example.c;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.c.ui.BitmapActivity;
import com.example.c.ui.BitmapChangeActivity;
import com.example.c.ui.ComputeActivity;
import com.example.c.ui.DESActivity;
import com.example.c.ui.FaceActivity;
import com.example.c.ui.HelloActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Used to load the 'native-lib' library on application startup.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.button1:
                startAct(HelloActivity.class);
                break;
            case R.id.button2:
                startAct(ComputeActivity.class);
                break;
            case R.id.button3:
                startAct(FaceActivity.class);
                break;
            case R.id.button4:
                startAct(DESActivity.class);
                break;
            case R.id.button5:
                startAct(BitmapActivity.class);
                break;
            case R.id.button6:
                startAct(BitmapChangeActivity.class);
                break;
        }
    }

    private void startAct(Class<? extends AppCompatActivity> clazz) {

        Intent intent = new Intent(this, clazz);
        startActivity(intent);
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */

}
