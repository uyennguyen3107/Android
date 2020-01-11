package com.example.baithi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PhongDoiActivity extends AppCompatActivity {

    Button btndoi1, btndoi2, btndoi3, btndoi4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phong_doi);
        btndoi1 = (Button) findViewById(R.id.doi1);
        btndoi2 = (Button) findViewById(R.id.doi2);
        btndoi3 = (Button) findViewById(R.id.doi3);
        btndoi4 = (Button) findViewById(R.id.doi4);
        ControlButton();
    }
    private void ControlButton()
    {
        btndoi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dp = new Intent(PhongDoiActivity.this, TinhTienActivity.class);
                startActivity(dp);
            }
        });
        btndoi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dp = new Intent(PhongDoiActivity.this, TinhTienActivity.class);
                startActivity(dp);
            }
        });
        btndoi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dp = new Intent(PhongDoiActivity.this, TinhTienActivity.class);
                startActivity(dp);
            }
        });
        btndoi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dp = new Intent(PhongDoiActivity.this, TinhTienActivity.class);
                startActivity(dp);
            }
        });
    }
}
