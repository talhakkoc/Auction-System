package com.example.acer.auctionsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OfferHistory extends AppCompatActivity {
    Button btnCancel ;
    Button button15;
    Button btnGf ;

    EditText TextFeed2;
    EditText TextFeed3;
    EditText TextFeed1;
    EditText TextFeed4;
    EditText TextFeed5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer_history);

        button15 =(Button)findViewById(R.id.button15);
        btnGf =(Button)findViewById(R.id.btnGf);
        btnCancel = (Button) findViewById(R.id.btnCancel);
        TextFeed2=(EditText)findViewById(R.id.TextFeed2);
        TextFeed1=(EditText)findViewById(R.id.TextFeed1);
        TextFeed3=(EditText)findViewById(R.id.TextFeed3);
        TextFeed4=(EditText)findViewById(R.id.TextFeed4);
        TextFeed5=(EditText)findViewById(R.id.TextFeed5);

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OfferHistory.this,MainActivity.class));
            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OfferHistory.this,User.class));
            }
        });
        btnGf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  Global.arrList.get(0);
                TextFeed1.setText(Global.arrListP.get(0) +" : "+ Global.arrListBid.get(0));
                TextFeed2.setText(Global.arrListP.get(1) +" : "+ Global.arrListBid.get(1));
                TextFeed3.setText(Global.arrListP.get(2) +" : "+ Global.arrListBid.get(2));
                TextFeed4.setText(Global.arrListP.get(3) +" : "+ Global.arrListBid.get(3));
                TextFeed5.setText(Global.arrListP.get(4) +" : "+ Global.arrListBid.get(4));

   /*           try{

                    FileInputStream fis = openFileInput("dosya");
                    InputStreamReader isr = new InputStreamReader(fis);
                    BufferedReader br = new BufferedReader(isr);
                    txtView2=(EditText)findViewById(R.id.txtYazi2);
                    txtView2.setText(br.readLine());
                    fis.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
*/
            }
        });
    }
}

