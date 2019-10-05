package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView   tv1= findViewById(R.id.tv1);
        Button  bt1= findViewById(R.id.bt1);
        final EditText   et1= findViewById(R.id.et1);
        final Intent myintent = new Intent (this, Main2Activity.class);





        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                myintent.putExtra("1", et1.getText().toString());

                startActivity(myintent);


            }
















                               }












        );







    }
}
