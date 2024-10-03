package com.example.ex03;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edta, edtb, edtc;
    Button btncong, btntru, btnnhan, btnchia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        edta = findViewById(R.id.edta);
        edtb = findViewById(R.id.edtb);
        edtc = findViewById(R.id.edtc);
        btncong = findViewById(R.id.btncong);
        btntru = findViewById(R.id.btntru);
        btnnhan = findViewById(R.id.btnnhan);
        btnchia = findViewById(R.id.btnchia);
        btncong.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int a = Integer.parseInt("0"+ edta.getText());
                int b = Integer.parseInt("0"+ edtb.getText());
                edtc.setText("a + b = " +( a + b));
            }
                                   }
        );
        btntru.setOnClickListener(new View.OnClickListener() {
                                       public void onClick(View v) {
                                           int a = Integer.parseInt("0"+ edta.getText());
                                           int b = Integer.parseInt("0"+ edtb.getText());
                                           edtc.setText("a - b = " +( a - b));
                                       }
                                   }
        );
        btnnhan.setOnClickListener(new View.OnClickListener() {
                                       public void onClick(View v) {
                                           int a = Integer.parseInt("0"+ edta.getText());
                                           int b = Integer.parseInt("0"+ edtb.getText());
                                           edtc.setText("a * b = " +( a * b));
                                       }
                                   }
        );
        btnchia.setOnClickListener(new View.OnClickListener() {
                                       public void onClick(View v) {
                                           int a = Integer.parseInt("0"+ edta.getText());
                                           int b = Integer.parseInt("0"+ edtb.getText());
                                           if (b == 0) {
                                               edtc.setText("B phai la khac 0 ");
                                           } else {
                                               edtc.setText("a / b = " +( a / b));
                                           }
                                       }
                                   }
        );


    }
}