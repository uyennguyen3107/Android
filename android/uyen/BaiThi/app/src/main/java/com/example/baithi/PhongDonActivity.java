package com.example.baithi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PhongDonActivity extends AppCompatActivity {

    Button btndon1, btndon2, btndon3,btndon4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phong_don);
        btndon1 = (Button) findViewById(R.id.don1);
        btndon2 = (Button) findViewById(R.id.don2);
        btndon3 = (Button) findViewById(R.id.don3);
        btndon4 = (Button) findViewById(R.id.don4);
        ControlButton();
    }
    private void ControlButton()
    {
        btndon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dp = new Intent(PhongDonActivity.this, TinhTienActivity.class);
                startActivity(dp);
            }
        });
        btndon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dp = new Intent(PhongDonActivity.this, TinhTienActivity.class);
                startActivity(dp);
            }
        });
        btndon3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dp = new Intent(PhongDonActivity.this, TinhTienActivity.class);
                startActivity(dp);
            }
        });
        btndon4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dp = new Intent(PhongDonActivity.this, TinhTienActivity.class);
                startActivity(dp);
            }
        });
    }
}
