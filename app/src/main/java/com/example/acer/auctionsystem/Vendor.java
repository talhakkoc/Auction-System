package com.example.acer.auctionsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Vendor extends AppCompatActivity {
        Button btnMain;
   /*     Button btnSell;
        Button btnFeed;
        Button btnTran;
        Button btnAdd;
        Button btnInfo;
        */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor);
        btnMain = (Button)findViewById(R.id.btnMain);
    /*    btnSell = (Button)findViewById(R.id.btnSell);
        btnFeed = (Button)findViewById(R.id.btnFeed);
        btnTran = (Button)findViewById(R.id.btnTran);
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnInfo = (Button)findViewById(R.id.btnInfo);
*/
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Vendor.this,MainActivity.class));
            }
        });
    }
}
