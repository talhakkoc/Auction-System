package com.example.acer.auctionsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Vendor extends AppCompatActivity {
        Button btnMain;
    Button btnProInfo;
   /*     Button btnSell;

        Button btnTran;

        Button btnInfo;
        */

   Button btnAdd;
   Button btnSearch;
    Button btnProducts;
    Button btnFeedT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor);
        btnMain = (Button)findViewById(R.id.btnMain);
        btnFeedT = (Button)findViewById(R.id.btnFeedT);
        btnProInfo = (Button)findViewById(R.id.btnProInfo);
    /*    btnSell = (Button)findViewById(R.id.btnSell);
        btnFeed = (Button)findViewById(R.id.btnFeed);
        btnTran = (Button)findViewById(R.id.btnTran);

        btnInfo = (Button)findViewById(R.id.btnInfo);
*/
      //  btnProducts = (Button) findViewById(R.id.btnProducts);
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnSearch = (Button)findViewById(R.id.btnSearch);
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Vendor.this,MainActivity.class));
            }
        });
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Vendor.this,SearchFeedback.class));
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Vendor.this,AddProduct.class));
            }
        });

        btnProInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Vendor.this,AddProductDesc.class));
            }
        });
        btnFeedT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Vendor.this,AddFeedTech.class));
            }
        });
    }
}
