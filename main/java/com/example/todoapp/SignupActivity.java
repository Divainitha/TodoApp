package com.example.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button btn = findViewById(R.id.registerBtn);

        btn.setOnClickListener(v -> {
            startActivity(new Intent(this, LoginActivity.class));
        });
    }
}