package com.example.muthu;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class bookingActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking2);

        findViewById(R.id.edt).setOnClickListener(v -> {
            startActivity(new Intent(this, SuccessActivity.class));
            finish();
        });
    }
}