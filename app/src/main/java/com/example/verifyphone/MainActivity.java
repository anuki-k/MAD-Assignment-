package com.example.verifyphone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.verifyphone.R.id.textView6;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    Button btn = (Button) findViewById(R.id.button2);
    EditText edt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=(TextView) findViewById(R.id.textView2);
        txt=(TextView) findViewById(R.id.textView3);
        edt =(EditText) findViewById(R.id.ed1);
        btn=(Button) findViewById(R.id.button2);
        txt=(TextView) findViewById(R.id.textView4);
        txt=(TextView) findViewById(R.id.textView5);
        txt=(TextView) findViewById(textView6);
        btn=(Button) findViewById(R.id.button3);


    }
}