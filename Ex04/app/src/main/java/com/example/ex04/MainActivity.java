 package com.example.ex04;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

 public class MainActivity extends AppCompatActivity {

    EditText editFar, editCel;
    Button btnFar, btnCel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        editCel = findViewById(R.id.editCel);
        editFar = findViewById(R.id.editFar);
        btnCel = findViewById(R.id.btnCel);
        btnFar = findViewById(R.id.btnFar);
        btnCel.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                DecimalFormat dcf = new DecimalFormat("#.00");
                String doC = editCel.getText() + "";
                int C = Integer.parseInt(doC);
                editFar.setText(""+ dcf.format(C*1.8+32));
            }

                                  }
        );
        btnFar.setOnClickListener(new View.OnClickListener(){
                                      public void onClick(View v) {
                                          DecimalFormat dcf = new DecimalFormat("#.00");
                                          String doF = editFar.getText() + "";
                                          int F = Integer.parseInt(doF);
                                          editCel.setText(""+ dcf.format((F-32)/1.8));
                                      }

                                  }
        );


    }
}