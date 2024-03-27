package com.mybundle.daman;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class helpp extends AppCompatActivity {
    TextView txt3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpp);
        txt3 = findViewById(R.id.textView3);

    }
}