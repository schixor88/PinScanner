package com.example.sushil.pinscanner;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.Button;

public class PageOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_one);


        Button buttonNtc = (Button) findViewById(R.id.btnntc);
        buttonNtc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent ntc = new Intent(PageOne.this, PageTwo.class);
                startActivity(ntc);
            }

        } );


        Button buttonNcell =(Button) findViewById(R.id.btnncell);
        buttonNcell.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Intent ncell = new Intent(PageOne.this, PageTwo.class);
                startActivity(ncell);
            }
        });


    }
}
