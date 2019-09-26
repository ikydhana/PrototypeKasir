package com.zahar.kasirapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityConfirm extends AppCompatActivity implements View.OnClickListener {
    Button btnsukses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

        btnsukses = findViewById(R.id.btnSukses);
        btnsukses.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSukses:
                Intent suksesIntent = new Intent(ActivityConfirm.this, ActivityMuka.class);
                startActivity(suksesIntent);
                break;
        }
    }
}
