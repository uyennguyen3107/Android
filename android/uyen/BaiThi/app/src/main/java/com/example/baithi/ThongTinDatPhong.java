package com.example.baithi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class ThongTinDatPhong extends AppCompatActivity {
    EditText tenkh,socmnd,sophone,loaip,sop,sodemo,songayo,tt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_tin);
        tenkh=(EditText) findViewById(R.id.tenkh);
        socmnd=(EditText) findViewById(R.id.cmnd);
        sophone=(EditText) findViewById(R.id.phone);
        loaip=(EditText) findViewById(R.id.loaiphong);
        sop=(EditText) findViewById(R.id.sophong);
        songayo=(EditText) findViewById(R.id.ngayo);
        sodemo=(EditText) findViewById(R.id.demo);
        tt=(EditText) findViewById(R.id.tongtien);
        Intent intent= getIntent();
        Bundle bundle1 = intent.getExtras();
        if(bundle1!=null){
        String customer=bundle1.getString("cur", "");
        String cmnd = bundle1.getString("num","");
        String sdt = bundle1.getString("sodt","");
        String lphong=bundle1.getString("ph","");
        String sophong=bundle1.getString("sp","");
        String ngay=bundle1.getString("day","");
        String demo=bundle1.getString("dem","");
        String tien=bundle1.getString("tt","");
        tenkh.setText(customer);
        socmnd.setText(cmnd);
        sophone.setText(sdt);
        loaip.setText(lphong);
        sop.setText(sophong);
        songayo.setText(ngay);
        sodemo.setText(demo);
        tt.setText(tien);}
    }
}
