package com.example.acer.auctionsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
        Button btnMain;
        EditText Pass2;
        EditText Pass;
        EditText Yid;
        EditText Mail;
    String id;
    String pass;

    Button btnRegisterU;
  Button btnRegisterV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btnMain= (Button)findViewById(R.id.btnMain);
        btnRegisterV =(Button)findViewById(R.id.btnRegisterv);
        btnRegisterU =(Button)findViewById(R.id.btnRegisterU);
        Yid=(EditText)findViewById(R.id.Yid);
        Mail=(EditText)findViewById(R.id.Mail);
        Pass=(EditText)findViewById(R.id.Pass);
        Pass2=(EditText)findViewById(R.id.Pass2);

        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Register.this,MainActivity.class));
            }
        });

        btnRegisterU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id= Yid.getText().toString();
                Global.arrayListUseri.add(id);
                Yid.setText("");
                String pass= Pass.getText().toString();
                Global.arrayListUserp.add(pass);
                Pass.setText("");
                Pass2.setText("");

                Toast.makeText(getApplicationContext(), "User Registration Successful\n", Toast.LENGTH_LONG).show();
            }
        });
        btnRegisterV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id= Yid.getText().toString();
                Global.arrayListRegi.add(id);
                Yid.setText("");
                String pass= Pass.getText().toString();
                Global.arrayListRegp.add(pass);
                Pass.setText("");
                Pass2.setText("");

                Toast.makeText(getApplicationContext(), "Vendor Registration Successful\n", Toast.LENGTH_LONG).show();


            }
        });
    }
}

