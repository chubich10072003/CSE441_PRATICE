package com.example.prac01;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class ChildActivity extends AppCompatActivity {

    private EditText etFullName;
    private EditText etGpa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        etFullName = findViewById(R.id.etFullName);
        etGpa = findViewById(R.id.etGpa);
        Button btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(v -> {
            String fullName = etFullName.getText().toString();
            String gpa = etGpa.getText().toString();

            Intent resultIntent = new Intent();
            resultIntent.putExtra("fullName", fullName);
            resultIntent.putExtra("gpa", gpa);

            setResult(RESULT_OK, resultIntent);
            finish();
        });
    }
}
