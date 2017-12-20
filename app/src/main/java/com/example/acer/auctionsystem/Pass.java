package com.example.acer.auctionsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pass extends AppCompatActivity {
        Button btnMain;
        //Button btnSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass);
        btnMain = (Button) findViewById(R.id.btnMain);
       // btnSend=(Button)findViewById(R.id.btnSend);

        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Pass.this,MainActivity.class));
            }
        });
    }
}

