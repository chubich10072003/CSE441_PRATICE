package com.example.prac01;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE = 1;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.tvResult);
        Button btnStartChildActivity = findViewById(R.id.btnStartChildActivity);

        btnStartChildActivity.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ChildActivity.class);
            startActivityForResult(intent, REQUEST_CODE);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK && data != null) {
            String fullName = data.getStringExtra("fullName");
            String gpa = data.getStringExtra("gpa");

            String resultText = "Full Name: " + fullName + "\nGPA: " + gpa;
            tvResult.setText(resultText);
        }
    }
}
