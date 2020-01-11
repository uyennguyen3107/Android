package com.example.baithi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText eduser, edpass, edtaikhoan, edmatkhau;
    Button btndky, btndnhap, btnthoat, btnhuy, btndy;
    String ten, mk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Anhxa();
        ControlButton();
    }

    private void Anhxa()
    {
        eduser = (EditText) findViewById(R.id.edituser);
        edpass = (EditText) findViewById(R.id.editpass);
        btndky = (Button) findViewById(R.id.btdangky) ;
        btndnhap = (Button) findViewById(R.id.btdangnhap);
        btnthoat = (Button) findViewById(R.id.btthoat);
    }

    private void ControlButton() {
        btnthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // AlertDialog : đã tạo sẵn layout và khi dùng thì chỉ cần gọi lại các thuôc tính của nó và sét sự kiện cho cái layout này
                // Dialog : thì chưa có cái layuot nào cả -> phải tự tạo cái layout mà mình muốn rồi gán vào dialog

                AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this,android.R.style.Theme_DeviceDefault_Light_Dialog);
                // Theme_DeviceDefault_Light_Dialog : ko bao gi het

                builder.setTitle("Bạn có chắc muốn thoát khỏi app");
                builder.setMessage("Hãy lựa chọn bên dưới để xác nhận");
                builder.setIcon(android.R.drawable.ic_dialog_alert); // tạo icon
                //  builder.setCancelable(); // clcik bên ngoài sẽ tự độngtắt cái alert
                // nếu ko set j hết thì sẽ mặc định clcik bên ngoài sẽ tự độngtắt cái alert

                builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        onBackPressed(); // giúp thoát khỏ app
                    }
                });

                builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                builder.show();
            }
        });
        btndky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(LoginActivity.this);
                dialog.setTitle("Hộp thoại xủ lý");
                dialog.setCancelable(false); // click bên ngaoif hộp thoại thì sẽ ko tắt hộp thoại đi
                dialog.setContentView(R.layout.cutomdialog);
                final EditText edtaikhoan = (EditText) dialog.findViewById(R.id.edtk);
                final EditText edmatkhau = (EditText) dialog.findViewById(R.id.edmk);
                Button btnhuy = (Button) dialog.findViewById(R.id.bthuy);
                Button btndy = (Button) dialog.findViewById(R.id.btdongy);
                btndy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    // khi click vào button đông ý thì sẽ lấy dữ liệu của 2 edittex của Dăng ký gán vào form đăng nhâp
                    public void onClick(View v) {
                        ten = edtaikhoan.getText().toString().trim();
                        mk = edmatkhau.getText().toString().trim();

                        eduser.setText(ten);
                        edpass.setText(mk);

                        dialog.cancel();
                    }
                });
                btnhuy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.cancel();
                    }
                });
                dialog.show();
            }
        });
        btndnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (eduser.getText().length() != 0 && edpass.getText().length() !=0)
                {
                    if (eduser.getText().toString().equals(ten) && edpass.getText().toString().equals(mk))
                    {
                        Toast.makeText(LoginActivity.this,"Bạn đã đăng nhập thành công", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                        startActivity(intent);
                    }
                    else if (eduser.getText().toString().equals("admin") && edpass.getText().toString().equals("123"))
                    {
                        Toast.makeText(LoginActivity.this,"Bạn đã đăng nhập thành công", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Toast.makeText(LoginActivity.this,"Đăng nhập thất bại", Toast.LENGTH_LONG).show();
                    }
                }
                else
                {
                    Toast.makeText(LoginActivity.this,"Mời bạn nhập đủ thông tin", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}
