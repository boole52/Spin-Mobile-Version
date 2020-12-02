package com.example.spin_booletht;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Buttons(View v){


        if(v.getId()==R.id.button){
            //uygulama ekranına geçiş
            Intent intent=new Intent(getApplicationContext(),activity2.class);
            startActivity(intent);
        }



    }

}