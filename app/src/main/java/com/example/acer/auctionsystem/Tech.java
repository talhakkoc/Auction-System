package com.example.acer.auctionsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tech extends  User {
        Button btnMain ;
        //Button btnUpdate;
        //Button btnView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech);
        //btnUpdate = (Button)findViewById(R.id.btnUpdate);
        //btnView = (Button)findViewById(R.id.btnView);
        btnMain = (Button)findViewById(R.id.btnMain);
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Tech.this,MainActivity.class));
            }
        });

    }
}
