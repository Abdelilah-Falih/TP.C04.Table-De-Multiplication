package com.example.table_de_multiplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Button btnEffacer,btnAfficher,btnQuitter,btnColor1,btnColor2,btnColor3;
    EditText nbrSaisi;
    ConstraintLayout layoutT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEffacer = findViewById(R.id.btnEffacer);
        btnAfficher = findViewById(R.id.btnAfficher);
        btnQuitter = findViewById(R.id.btnQuitter);
        nbrSaisi = findViewById(R.id.nbrSaisi);
        btnColor1 = findViewById(R.id.btnColor1);
        btnColor2 = findViewById(R.id.btnColor2);
        btnColor3 = findViewById(R.id.btnColor3);
        layoutT  = findViewById(R.id.layoutT);
        btnColor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutT.setBackgroundColor(Color.WHITE);
            }
        });
        btnColor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutT.setBackgroundColor(0x9FF3A5D6);
            }
        });
        btnColor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutT.setBackgroundColor(0xFFBB86FC);
            }
        });

        btnEffacer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nbrSaisi.setText("");
            }
        });
        btnQuitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}