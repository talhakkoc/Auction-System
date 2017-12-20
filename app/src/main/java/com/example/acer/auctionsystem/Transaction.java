package com.example.acer.auctionsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Transaction extends AppCompatActivity {
        Button btnMain;
        Button btnCancel;
        //Button btnWit;
        //Button btnDeposit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);
       // btnDeposit = (Button)findViewById(R.id.btnDeposit);
       // btnWit=(Button)findViewById(R.id.btnWit);
        btnMain =(Button)findViewById(R.id.btnMain);
        btnCancel = (Button) findViewById(R.id.btnCancel);
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Transaction.this,MainActivity.class));
            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Transaction.this,User.class));
            }
        });
    }
}