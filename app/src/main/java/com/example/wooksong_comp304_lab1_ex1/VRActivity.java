package com.example.wooksong_comp304_lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class VRActivity extends AppCompatActivity {

    private TextView textStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vr);
        textStatus = (TextView)findViewById(R.id.text_activity_vr_status);
    }

    @Override
    protected void onStart() {
        super.onStart();
        textStatus.setText(R.string.lifecycle_status_onstart);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        textStatus.setText(R.string.lifecycle_status_onrestart);
    }

    protected void onResume() {
        super.onResume();
        textStatus.setText(R.string.lifecycle_status_onresume);
    }

    @Override
    protected void onPause() {
        super.onPause();
        textStatus.setText(R.string.lifecycle_status_onpause);
    }

    @Override
    protected void onStop() {
        super.onStop();
        textStatus.setText(R.string.lifecycle_status_onstop);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        textStatus.setText(R.string.lifecycle_status_ondestroy);
    }
}