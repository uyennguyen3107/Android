package com.example.baithi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PhongDaActivity extends AppCompatActivity {

    Button btnda1, btnda2, btnda3, btnda4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phong_da);
        btnda1 = (Button) findViewById(R.id.da1);
        btnda2 = (Button) findViewById(R.id.da2);
        btnda3 = (Button) findViewById(R.id.da3);
        btnda4 = (Button) findViewById(R.id.da4);
        ControlButton();
    }
    private void ControlButton()
    {
        btnda1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dp = new Intent(PhongDaActivity.this, TinhTienActivity.class);
                startActivity(dp);
            }
        });
        btnda2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dp = new Intent(PhongDaActivity.this, TinhTienActivity.class);
                startActivity(dp);
            }
        });
        btnda3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dp = new Intent(PhongDaActivity.this, TinhTienActivity.class);
                startActivity(dp);
            }
        });
        btnda4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dp = new Intent(PhongDaActivity.this, TinhTienActivity.class);
                startActivity(dp);
            }
        });
    }
}
