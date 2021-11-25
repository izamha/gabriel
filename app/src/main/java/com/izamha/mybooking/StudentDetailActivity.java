package com.izamha.mybooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.izamha.mybooking.model.Student;

import java.util.ArrayList;

public class StudentDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_detail);

        TextView username = findViewById(R.id.username);
        ImageView studentImage = findViewById(R.id.student_image);

        Intent intent = getIntent();

        String receivedName = intent.getStringExtra("student");
        int receivedImage = intent.getIntExtra("studentImage", 0);
        studentImage.setImageResource(receivedImage);
        username.setText(receivedName);

    }
}