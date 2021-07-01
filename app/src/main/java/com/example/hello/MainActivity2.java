package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private EditText et;
    private EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        et = findViewById(R.id.etAge);
        et2 = findViewById(R.id.etYear);
    }

    public void onA(View view) {
        //나이 가져오기
        int age = Integer.parseInt(et.getText().toString());
        //나이를 생년으로
        int iage = 2021 - age;
        //나이를 토스트로 띄우기
        Toast.makeText(this, iage+ "", Toast.LENGTH_SHORT).show();
    }

    public void onY(View view) {
        String year = et2.getText().toString();
        int iYear = 2021 - Integer.parseInt(year);
        Toast.makeText(this, iYear+ "", Toast.LENGTH_SHORT).show();
    }
}