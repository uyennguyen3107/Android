package com.example.baithi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TinhTienActivity extends AppCompatActivity {

    Button btnQL, btnTinhtien, btnXacNhanDP;
    EditText loaiphong, sophongdat, ngayo, dem;
    TextView tinhtien;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tinh_tien);
        btnQL = (Button) findViewById(R.id.quaylai);
        btnTinhtien = (Button) findViewById(R.id.bttien);
        btnXacNhanDP = (Button) findViewById(R.id.btxndp);
        loaiphong = (EditText) findViewById(R.id.edloaiphong);
        sophongdat = (EditText) findViewById(R.id.edsophong);
        ngayo = (EditText) findViewById(R.id.edngayo);
        dem = (EditText)findViewById(R.id.eddem) ;
        tinhtien = (TextView) findViewById(R.id.thtien);


        btnTinhtien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int isongayo,isodemo, isophong, itienngay, itiendem, itongtien = 0;
                String ssongayo, ssodemo, sloaiphong, ssophong;
                if (ngayo.getText().toString().isEmpty() || dem.getText().toString().isEmpty()
                        || sophongdat.getText().toString().isEmpty()||loaiphong.getText().toString().isEmpty()) {
                    Toast.makeText(TinhTienActivity.this,"Mời bạn nhập đủ thông tin", Toast.LENGTH_LONG).show();
                }
                else{sloaiphong=loaiphong.getText().toString();
                    ssophong=sophongdat.getText().toString();
                    isophong=Integer.parseInt(ssophong);
                    ssongayo=ngayo.getText().toString();
                    isongayo=Integer.parseInt(ssongayo);
                    ssodemo=ngayo.getText().toString();
                    isodemo=Integer.parseInt(ssodemo);
                    if (sloaiphong.equals("don")) {
                        /* itongtien = isongayo*isophong*500000;*/
                        int  igiangay=500000, igiadem=300000;
                        itienngay = isongayo*igiangay*isophong;
                        itiendem = isodemo*igiadem*isophong;
                        itongtien = itienngay + itiendem;
                    }
                    else if (sloaiphong.equals("doi")) {
                        // itongtien = isongayo*isophong*700000;
                        int  igiangay=600000, igiadem=300000;
                        itienngay = isongayo*igiangay*isophong;
                        itiendem = isodemo*igiadem*isophong;
                        itongtien = itienngay + itiendem;
                    }
                    else {
                        // itongtien = isongayo*isophong*1000000;
                        int  igiangay=700000, igiadem=300000;
                        itienngay = isongayo*igiangay*isophong;
                        itiendem = isodemo*igiadem*isophong;
                        itongtien = itienngay + itiendem;
                    }
                }
                    tinhtien.setText(itongtien+"VND");
                }
        });



        btnQL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnXacNhanDP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ngayo.getText().toString().isEmpty() || dem.getText().toString().isEmpty() || sophongdat.getText().toString().isEmpty()
                ||loaiphong.getText().toString().isEmpty())
                {
                    Toast.makeText(TinhTienActivity.this,"Mời bạn nhập đủ thông tin", Toast.LENGTH_LONG).show();
                }
                else {
                    Intent xn = new Intent(TinhTienActivity.this, DatPhongActivity.class);
                    String lphong = loaiphong.getText().toString();
                    String sophong = sophongdat.getText().toString();
                    String ngay = ngayo.getText().toString();
                    String demo = dem.getText().toString();
                    String tien = tinhtien.getText().toString();
                    Bundle bundle = new Bundle();
                    bundle.putString("ph",lphong);
                    bundle.putString("sp",sophong);
                    bundle.putString("day",ngay);
                    bundle.putString("dem",demo);
                    bundle.putString("tt",tien);
                    xn.putExtra("thanhtoan",bundle);

                    startActivity(xn);
                }

            }
        });

    }
}
