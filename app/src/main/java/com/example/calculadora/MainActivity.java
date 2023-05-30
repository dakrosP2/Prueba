package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edt1, edt2;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1=findViewById(R.id.txt_num1);
        edt2=findViewById(R.id.txt_num2);
        tv=findViewById(R.id.lbl_res);
    }
    public void suma(View View){
        int num1=Integer.parseInt(edt1.getText().toString());
        int num2=Integer.parseInt(edt2.getText().toString());
        int res=num1+num2;
        tv.setText("" + res);
    }
    public void resta(View View){
        int num1=Integer.parseInt(edt1.getText().toString());
        int num2=Integer.parseInt(edt2.getText().toString());
        int res=num1-num2;
        tv.setText("" + res);
    }
    public void mult(View View){
        int num1=Integer.parseInt(edt1.getText().toString());
        int num2=Integer.parseInt(edt2.getText().toString());
        int res=num1*num2;
        tv.setText(""+ res);
    }
    public void div(View View){
        int num1=Integer.parseInt(edt1.getText().toString());
        int num2=Integer.parseInt(edt2.getText().toString());
        int res=num1/num2;
        tv.setText(""+res);
    }
    }
