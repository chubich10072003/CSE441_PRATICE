package com.example.ex02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "63KTPM2 - onCreat()", Toast.LENGTH_SHORT).show();
        btnCall = findViewById(R.id.btnCall);
        btnCall.setOnClickListener(new View.OnClickListener() {
            public void onClick( View v ) {
                // todo kết nối hai phương thức lại
                Intent intent1 = new Intent(MainActivity.this,Subactivity.class);
                startActivity(intent1);
            }
                                   }
        );

    }

    @Override
    protected void onStop() {
        Toast.makeText(this,"63KTPM2 - onStop()",Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override
    protected void onDestroy() {

        Toast.makeText(this,"63KTPM2 - onDestroy()",Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"63KTPM2 - onStart()",Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"63KTPM2 - onResume()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"63KTPM2 - onRestart()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"63KTPM2 - onPause()",Toast.LENGTH_SHORT).show();
    }

}