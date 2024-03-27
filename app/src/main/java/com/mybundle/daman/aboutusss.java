package com.mybundle.daman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class aboutusss extends AppCompatActivity {
    ImageView img11;
    TextView txt1;
    TextView txt2;
    ImageView logoo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutusss);


        logoo = findViewById(R.id.logo);
        txt1 = findViewById(R.id.txtt);
        txt2 = findViewById(R.id.txttt);
    }
}