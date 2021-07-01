package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int count =0;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        textView = findViewById(R.id.txtCount);
    }

    public void onToastClick(View view){
        //메박 띄우기
        Toast.makeText(this, "hello Toast", Toast.LENGTH_SHORT).show();
    }
    public void onCountClick(View view){
        //메박 띄우기 ++ , textview에 보이기
        //text에서 불러오기!
        //count = Integer.parseInt(textView.getText().toString());
        count++;
        textView.setText(count + "");
    }
}