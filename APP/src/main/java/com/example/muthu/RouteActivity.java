package com.example.muthu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class RouteActivity extends AppCompatActivity {

    private Button timing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route);
        timing=findViewById(R.id.timing);
        timing.setOnClickListener(view -> {
            startActivity(new Intent(RouteActivity.this,timesActivity2.class));
            finish();
        });
    }
}