package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    private EditText etAme;
    private EditText etLatte;
    private EditText etMoca;
    private TextView txtCount;
    private TextView txtDC;
    private TextView txtPay;
    private CheckBox chDC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        etAme = findViewById(R.id.etAmericano);
        etLatte = findViewById(R.id.etLatte);
        etMoca = findViewById(R.id.etMoca);
        txtCount = findViewById(R.id.txtMenuCount);
        txtDC = findViewById(R.id.txtDC);
        txtPay = findViewById(R.id.txtPayment);
        chDC = findViewById(R.id.checkBox);
    }

    public void onCalculate(View view) {
        int total = 0;
        int count = 0;
        int finTotal = 0;
        int dc = 0;
        //text값 받기
        int americano = Integer.parseInt(etAme.getText().toString());
        int cafeLatte = Integer.parseInt(etLatte.getText().toString());
        int cafeMoca = Integer.parseInt(etMoca.getText().toString());
        //개수 계산 / 총액 계산
        count = americano + cafeLatte + cafeMoca;
        total = americano*1000 + cafeLatte*1500 + cafeMoca*1700;
        //할인금액 계산 총 * 0.1
        if(chDC.isChecked()){
            dc = total / 10;
            txtDC.setText("할인금액 : " + dc + " 원");
        }
        //결재금액(총 - 할인)
        finTotal = total - dc;
        //출력
        txtCount.setText("주문 개수 : " + count + " 개");
        txtPay.setText("결제금액 : " + finTotal + " 원");
    }
}