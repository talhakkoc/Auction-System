package com.example.acer.auctionsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginScreen extends AppCompatActivity {
    Button btnMain;
    EditText txtId;//cevap yerindeki XXXX yazısının oldugu yer.
    EditText txtPass;
    Button btnLg;
    Button button;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        btnMain =(Button)findViewById(R.id.btnMain);
        btnLg =(Button)findViewById(R.id.btnLg);
        txtId=(EditText)findViewById(R.id.txtYazi2);
        txtPass=(EditText)findViewById(R.id.txtYazi3);
        button =(Button)findViewById(R.id.button);
        button2 =(Button)findViewById(R.id.button2);



        final String User1="T";
        final String User2="Ryan Babel";

        final String Tech1="Tec Person";
        final String Tech2="Salih Duman";

        final String UserPass1="1";
        final String UserPass2="1903";

        final String TechPass1="12345678";
        final String TechPass2="1234";

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtId.setText( Global.arrayListUseri.get(0));
                txtPass.setText( Global.arrayListUserp.get(0));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtId.setText(Tech1);
                txtPass.setText(TechPass1);
            }
        });

        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginScreen.this,MainActivity.class));
            }
        });
        btnLg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Id= txtId.getText().toString();
                String Pass =txtPass.getText().toString();

                if(Id.equals(User1) && Pass.equals(UserPass1)||(Id.equals(User2) && Pass.equals(UserPass2))||Id.equals(Global.arrayListUseri.get(0)) && Pass.equals(Global.arrayListUserp.get(0))) {
                    startActivity(new Intent(LoginScreen.this, User.class));
                }
                 if(Id.equals(Tech1) && Pass.equals(TechPass1)||(Id.equals(Tech2) && Pass.equals(TechPass2))){

                    startActivity(new Intent(LoginScreen.this, Tech.class));
                }

            }
        });


    }
}
