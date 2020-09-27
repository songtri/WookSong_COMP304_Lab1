package com.example.wooksong_comp304_lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Fragment bottomFragment;
    private TextView textStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomFragment = getSupportFragmentManager().findFragmentById(R.id.bottomFragment);
        textStatus = (TextView)findViewById(R.id.text_activity_main_status);

        RecyclerView view = findViewById(R.id.recyclerview_fragment_top);
        view.setLayoutManager(new LinearLayoutManager(this));
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