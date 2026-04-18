package com.example.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginBtn = findViewById(R.id.loginBtn);
        TextView signupText = findViewById(R.id.signupText);

        loginBtn.setOnClickListener(v -> {
            startActivity(new Intent(this, TodoActivity.class));
        });

        signupText.setOnClickListener(v -> {
            startActivity(new Intent(this, SignupActivity.class));
        });
    }
}