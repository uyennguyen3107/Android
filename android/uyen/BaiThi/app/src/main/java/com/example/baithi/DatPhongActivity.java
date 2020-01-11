package com.example.baithi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DatPhongActivity extends AppCompatActivity {
    EditText loaiphong, sophongdat, ngayo, dem, tong, tenkh, cmdn,sdt;
    Button xndp, btnqlai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dat_phong);
        tenkh=(EditText) findViewById(R.id.ten);
        cmdn=(EditText) findViewById(R.id.cmnd);
        sdt=(EditText) findViewById(R.id.sdt);
        loaiphong = (EditText) findViewById(R.id.loaiphong);
        sophongdat = (EditText) findViewById(R.id.sophong);
        ngayo = (EditText) findViewById(R.id.ngayo);
        dem = (EditText) findViewById(R.id.demo);
        tong = (EditText) findViewById(R.id.tongtien);
        xndp =(Button) findViewById(R.id.btxndp) ;
        btnqlai = (Button) findViewById(R.id.quaylai);
        Intent intent= getIntent();
        Bundle bundle = intent.getBundleExtra("thanhtoan");
        String lphong=bundle.getString("ph");
        String sophong=bundle.getString("sp");
        String ngay=bundle.getString("day");
        String demo=bundle.getString("dem");
        String tien=bundle.getString("tt");
        loaiphong.setText(lphong);
        sophongdat.setText(sophong);
        ngayo.setText(ngay);
        dem.setText(demo);
        tong.setText(tien);

        btnqlai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        xndp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tenkh.getText().toString().isEmpty() || cmdn.getText().toString().isEmpty() || sdt.getText().toString().isEmpty())
                {
                    Toast.makeText(DatPhongActivity.this,"Mời bạn nhập đủ thông tin", Toast.LENGTH_LONG).show();
                }
                else {
                    Intent thongtin = new Intent(DatPhongActivity.this, ThongTinDatPhong.class);
                    String cutormer= tenkh.getText().toString();
                    String number= cmdn.getText().toString();
                    String phone =sdt.getText().toString();
                    String lphong = loaiphong.getText().toString();
                    String sophong = sophongdat.getText().toString();
                    String ngay = ngayo.getText().toString();
                    String demo = dem.getText().toString();
                    String tien = tong.getText().toString();
                    Bundle bundle = new Bundle();
                    bundle.putString("cur",cutormer);
                    bundle.putString("num",number);
                    bundle.putString("sodt",phone);
                    bundle.putString("ph",lphong);
                    bundle.putString("sp",sophong);
                    bundle.putString("day",ngay);
                    bundle.putString("dem",demo);
                    bundle.putString("tt",tien);
                    thongtin.putExtras(bundle);

                    startActivity(thongtin);
                }

            }
        });
    }
}
