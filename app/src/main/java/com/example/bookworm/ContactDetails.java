package com.example.bookworm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ContactDetails extends AppCompatActivity {

    EditText name;
    EditText address;
    EditText phone;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_details);

        name = findViewById(R.id.name);
        address = findViewById(R.id.address);
        phone = findViewById(R.id.phone);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!name.getText().toString().isEmpty() && !phone.getText().toString().isEmpty() && !address.getText().toString().isEmpty())
                {
                }else {
                    Toast.makeText(ContactDetails.this, "please fill all the fields", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}