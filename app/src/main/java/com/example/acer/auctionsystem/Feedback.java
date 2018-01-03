package com.example.acer.auctionsystem;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import static com.example.acer.auctionsystem.Global.Save;

public class Feedback extends AppCompatActivity {
    String feedback ;
    Button btnMain;
    Button btnUser;
    Button btnVendor;
    Button btnSend;
    EditText feedB;//feedback yerindeki 'your feedback' yazısının oldugu yer.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        btnUser = (Button) findViewById(R.id.btnUser);
        btnVendor = (Button) findViewById(R.id.btnVendor);
        btnSend = (Button) findViewById(R.id.btnSend);
        feedB = (EditText) findViewById(R.id.feedB);
        btnMain = (Button) findViewById(R.id.btnMain);
        btnSend = (Button) findViewById(R.id.btnSend);



        btnUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Feedback.this,User.class));
            }
        });
        btnVendor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Feedback.this,Vendor.class));
            }
        });

        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Feedback.this,MainActivity.class));
            }
        });
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String feedback= feedB.getText().toString();
                Global.arrList.add(feedback);
                feedB.setText("");
             //   String feedback2= feedB.getText().toString();
               // Global.arrList.add(feedback2);


                //burada 'feedback' stringini text dosyasına yazdıracagız
                try{
                    FileOutputStream fos = openFileOutput("dosya",Context.MODE_PRIVATE);
                    fos.write(feedback.getBytes());//dosya oluştu. içine yazdık
                    fos.close();
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                try{
                    FileInputStream fis = openFileInput("dosya");
                    InputStreamReader isr = new InputStreamReader(fis);
                    BufferedReader br = new BufferedReader(isr);
                    TextView tv = (TextView) findViewById(R.id.feedback);
                    tv.setText(br.readLine());
                    fis.close();
                }catch(Exception e){
                    e.printStackTrace();
                }

            }
        });
        try{
            Resources r = getResources();
            InputStream is = r.openRawResource(R.raw.deneme);
            FileOutputStream fos = openFileOutput("deneme.txt",Context.MODE_PRIVATE);
            fos.write(feedback.getBytes());//dosya oluştu. içine yazdık
            fos.close();
            Scanner s = new Scanner(is);//scanner gitsin is'den okusun.
            s.next();//string okur
            TextView tv = (TextView) findViewById(R.id.feedback);
            String str =feedB.getText().toString();
            tv.setText(s.next()+ " " + s.next()+" "+s.next());

        }catch(Exception e){
            e.printStackTrace();
        }
Save();
//String cvp= txtCvp.getText().toString();
    }
}
