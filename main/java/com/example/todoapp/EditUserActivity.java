package com.example.todoapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class EditUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_user);

        EditText username = findViewById(R.id.editUsername);
        EditText email = findViewById(R.id.editEmail);
        Button saveBtn = findViewById(R.id.saveBtn);

        saveBtn.setOnClickListener(v -> {
            String user = username.getText().toString();
            String mail = email.getText().toString();

            Toast.makeText(this,
                    "Updated: " + user + " / " + mail,
                    Toast.LENGTH_LONG).show();

            finish();
        });
    }
}