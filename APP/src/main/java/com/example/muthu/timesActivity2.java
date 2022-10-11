package com.example.muthu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class timesActivity2 extends AppCompatActivity {

    private Button book;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_times2);
        book=findViewById(R.id.book);
        book.setOnClickListener(view -> {
            startActivity(new Intent(timesActivity2.this,bookingActivity2.class));
            finish();
        });
    }
}