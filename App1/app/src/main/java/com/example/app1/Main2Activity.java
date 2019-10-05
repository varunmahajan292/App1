package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        TextView tv1act2 = findViewById(R.id.tv1act2);
        Intent  i = getIntent();
        tv1act2.setText(i.getStringExtra("1"));




    }
}
