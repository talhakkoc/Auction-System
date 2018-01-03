package com.example.acer.auctionsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginScreenVendor extends AppCompatActivity {
    Button btnMain;
    EditText txtId;//cevap yerindeki XXXX yazısının oldugu yer.
    EditText txtPass;
    Button btnLg;
    Button btnFill;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen_vendor);

        btnMain =(Button)findViewById(R.id.btnMain);
        btnFill =(Button)findViewById(R.id.btnFill);
        btnLg =(Button)findViewById(R.id.btnLg);
        txtId=(EditText)findViewById(R.id.txtYazi2);
        txtPass=(EditText)findViewById(R.id.txtYazi3);

        final String Vendor1="Talha Akkoc";
        final String Vendor2="Dogus Yuksel";
        final String Vendor3="";
        final String VendorPass1="1996";
        final String VendorPass2="12345";
        final String VendorPass3="";


        btnFill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtId.setText( Global.arrayListRegi.get(0));
                txtPass.setText( Global.arrayListRegp.get(0));
            }
        });

        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginScreenVendor.this,MainActivity.class));
            }
        });
        btnLg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Id= txtId.getText().toString();
                String Pass =txtPass.getText().toString();

                if(Id.equals(Vendor1) && Pass.equals(VendorPass1)||(Id.equals(Vendor2) && Pass.equals(VendorPass2))||Id.equals(Global.arrayListRegi.get(0)) && Pass.equals(Global.arrayListRegp.get(0))) {
                    startActivity(new Intent(LoginScreenVendor.this, Vendor.class));

                }
                else
                    Toast.makeText(getApplicationContext(), "Wrong ID OR Pass\n", Toast.LENGTH_LONG).show();
            }
        });


    }
}
