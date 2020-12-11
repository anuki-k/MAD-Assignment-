package com.example.bookworm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;

public class Description extends AppCompatActivity {

    TextView bookname,bookdiscription,bookprice;
    Button btnUpdate,btnDelete;
    DatabaseReference reference;
    String name,discrip,pric,userId ;
    Book_Details bookDetails;
    //testing github

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        bookname = findViewById(R.id.bookname);
        bookdiscription = findViewById(R.id.description);
        bookprice = findViewById(R.id.price);

        Intent intent = getIntent();
        Book_Details book = (Book_Details) intent.getSerializableExtra("selectedBook");
        name = book.getName();
        bookname.setText(name);
        discrip = book.getDescription();
        bookdiscription.setText(discrip);
        pric = book.getPrice();
        bookprice.setText(pric);
    }
}