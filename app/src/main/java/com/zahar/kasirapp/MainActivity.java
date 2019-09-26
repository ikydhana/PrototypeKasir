package com.zahar.kasirapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnmasuk, btndaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnmasuk = findViewById(R.id.btnMasuk);
        btndaftar = findViewById(R.id.btnDaftar);
        btnmasuk.setOnClickListener(this);
        btndaftar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnMasuk:
                Intent mukaIntent = new Intent(MainActivity.this, ActivityMuka.class);
                startActivity(mukaIntent);
                break;
            case R.id.btnDaftar:
                Intent daftarIntent = new Intent(MainActivity.this, ActivityDaftar.class);
                startActivity(daftarIntent);
                break;
        }
    }
}
