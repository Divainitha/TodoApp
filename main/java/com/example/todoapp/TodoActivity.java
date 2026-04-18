package com.example.todoapp;

import android.content.Intent;   // 🔥 IMPORTANT
import android.os.Bundle;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class TodoActivity extends AppCompatActivity {

    EditText input;
    Button addBtn, userInfoBtn, devBtn;
    ListView listView;

    ArrayList<String> tasks;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);

        // connect UI
        input = findViewById(R.id.taskInput);
        addBtn = findViewById(R.id.addBtn);
        listView = findViewById(R.id.taskList);
        userInfoBtn = findViewById(R.id.userInfoBtn);
        devBtn = findViewById(R.id.devBtn);

        // setup list
        tasks = new ArrayList<>();
        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, tasks);

        listView.setAdapter(adapter);

        // add task
        addBtn.setOnClickListener(v -> {
            String task = input.getText().toString();

            if (!task.isEmpty()) {
                tasks.add(task);
                adapter.notifyDataSetChanged();
                input.setText("");
            }
        });

        // go to User Info
        userInfoBtn.setOnClickListener(v -> {
            startActivity(new Intent(TodoActivity.this, UserInfoActivity.class));
        });

        // go to Developer
        devBtn.setOnClickListener(v -> {
            startActivity(new Intent(TodoActivity.this, DeveloperActivity.class));
        });
    }
}