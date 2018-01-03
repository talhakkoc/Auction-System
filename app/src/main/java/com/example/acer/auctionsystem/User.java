package com.example.acer.auctionsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class User extends AppCompatActivity {
    Button btnHist;
    Button btnTran;
    Button btnFeed;
    Button btnMain;
    Button btnInfo;
    Button btnSearch;
    Button btnWrite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        btnMain = (Button)findViewById(R.id.btnMain);
        btnHist = (Button)findViewById(R.id.btnHist);
        btnTran = (Button)findViewById(R.id.btnTran);
        btnFeed = (Button)findViewById(R.id.btnFeed);
        btnSearch = (Button)findViewById(R.id.btnSearch);
        btnInfo = (Button)findViewById(R.id.btnInfo);
        btnWrite = (Button)findViewById(R.id.btnWrite);


        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(User.this,MainActivity.class));
            }
        });
        btnTran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(User.this,Transaction.class));
            }
        });
        btnFeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(User.this,SearchFeedback.class));
            }
        });
        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(User.this,ProductDesc.class));
            }
        });
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(User.this,Products.class));
            }
        });
        btnHist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(User.this,OfferHistory.class));
            }
        });
        btnWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(User.this,Feedback.class));
            }
        });
    }

}





