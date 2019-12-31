package com.example.c.ui;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.c.R;
import com.example.c.bean.BitmapUtils;

import org.opencv.android.BaseLoaderCallback;
import org.opencv.android.CameraBridgeViewBase;
import org.opencv.android.JavaCameraView;
import org.opencv.android.LoaderCallbackInterface;
import org.opencv.android.OpenCVLoader;
import org.opencv.core.Mat;

public class BitmapChangeActivity extends AppCompatActivity {

    static {
        System.loadLibrary("bitmap_change");
    }

    private ImageView imageChange;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.layout_bitmap_change);
        /* ActivityCompat.requestPermissions(BitmapChangeActivity.this,
                new String[]{Manifest.permission.CAMERA},
                1);*/
        initView();
    }

    private void initView() {
        imageChange = findViewById(R.id.imageChange);
    }

    public void change(View view) {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.small_lan);
        Bitmap opBitmap = BitmapUtils.opBitmap(bitmap, Bitmap.Config.ARGB_8888);
        imageChange.setImageBitmap(opBitmap);
    }
}
