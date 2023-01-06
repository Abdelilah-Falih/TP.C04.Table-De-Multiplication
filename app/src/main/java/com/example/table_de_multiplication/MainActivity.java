package com.example.table_de_multiplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnEffacer,btnAfficher,btnQuitter;
    EditText nbrSaisi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEffacer = findViewById(R.id.btnEffacer);
        btnAfficher = findViewById(R.id.btnAfficher);
        btnQuitter = findViewById(R.id.btnQuitter);
        nbrSaisi = findViewById(R.id.nbrSaisi);
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