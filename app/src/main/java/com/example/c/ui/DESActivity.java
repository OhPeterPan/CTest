package com.example.c.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.c.R;
import com.example.c.bean.EntryUtils;

public class DESActivity extends AppCompatActivity {
    static {
        System.loadLibrary("pwd_lib");
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_des);

        initView();
    }

    private void initView() {
        final AppCompatEditText editText = findViewById(R.id.des_edit);
        Button button_des = findViewById(R.id.button_des);
        final TextView tv_des_result = findViewById(R.id.tv_des_result);
        TextView tv_des_title = findViewById(R.id.tv_des_title);
        tv_des_title.setText(EntryUtils.getStringC());
        button_des.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = editText.getText().toString().trim();
                String encodeRes = EntryUtils.encode(result);
                tv_des_result.setText(encodeRes);
            }
        });
    }
}
