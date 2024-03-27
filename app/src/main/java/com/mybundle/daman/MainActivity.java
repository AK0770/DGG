package com.mybundle.daman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button aboutuss = findViewById(R.id.aboutus);
        Button helpsupportt = findViewById(R.id.helpsupport);
        Button signupp = findViewById(R.id.signup);
        Button privacyy = findViewById(R.id.privacy);


        helpsupportt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, helpp.class);
                startActivity(intent);
            }
        });

        signupp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://damanngames.com/"));
                startActivity(intent);
            }
        });

        aboutuss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, aboutusss.class);
                startActivity(intent);
            }
        });
        privacyy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://damanngames.com/privacy-policy/"));
                startActivity(intent);
            }
        });
    }
}
