package com.example.acer.auctionsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginScreenVendor extends AppCompatActivity {
    Button btnMain;
    EditText txtCvp;//cevap yerindeki XXXX yazısının oldugu yer.
    EditText txtCvp1;
    Button btnLg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen_vendor);

        btnMain =(Button)findViewById(R.id.btnMain);
        btnLg =(Button)findViewById(R.id.btnLg);
        txtCvp=(EditText)findViewById(R.id.txtYazi2);
        txtCvp1=(EditText)findViewById(R.id.txtYazi3);
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginScreenVendor.this,MainActivity.class));
            }
        });
        btnLg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginScreenVendor.this,Vendor.class));
            }
        });


    }
}
