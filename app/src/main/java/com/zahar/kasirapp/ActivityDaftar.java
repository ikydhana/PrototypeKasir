package com.zahar.kasirapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityDaftar extends AppCompatActivity implements View.OnClickListener {
    Button btnregis, btncancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        btnregis = findViewById(R.id.btnRegis);
        btncancel = findViewById(R.id.btnCancel);
        btnregis.setOnClickListener(this);
        btncancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnRegis:
                Intent regisIntent = new Intent(ActivityDaftar.this, ActivityConfirm.class);
                startActivity(regisIntent);
                break;
            case R.id.btnCancel:
                Intent cancelIntent = new Intent(ActivityDaftar.this, MainActivity.class);
                startActivity(cancelIntent);
                break;
        }
    }
}
