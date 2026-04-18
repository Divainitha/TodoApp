package com.example.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class UserInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

        Button editBtn = findViewById(R.id.editBtn);
        Button signOutBtn = findViewById(R.id.signOutBtn);

        editBtn.setOnClickListener(v -> {
            startActivity(new Intent(this, EditUserActivity.class));
        });

        signOutBtn.setOnClickListener(v -> {
            new AlertDialog.Builder(this)
                    .setTitle("Confirm")
                    .setMessage("Are you sure to sign out?")
                    .setPositiveButton("Yes", (d, w) -> {
                        startActivity(new Intent(this, LoginActivity.class));
                    })
                    .setNegativeButton("No", null)
                    .show();
        });
    }
}