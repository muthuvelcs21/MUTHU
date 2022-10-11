package com.example.muthu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private View signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        signin =findViewById(R.id.signin);
        signin.setOnClickListener(view -> {
            startActivity(new Intent(LoginActivity.this,RouteActivity.class));
            finish();
            Toast.makeText(this, "Sign In Successsfully", Toast.LENGTH_SHORT).show();
        });
    }
}