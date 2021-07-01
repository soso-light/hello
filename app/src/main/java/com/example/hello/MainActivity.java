package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
    }

    public void onToastClick(View view){
        //메박 띄우기
        Toast.makeText(this, "hello Toast", Toast.LENGTH_SHORT).show();
    }
    public void onCountClick(View view){
        //메박 띄우기
        Toast.makeText(this, "hello Count..", Toast.LENGTH_SHORT).show();
    }

}