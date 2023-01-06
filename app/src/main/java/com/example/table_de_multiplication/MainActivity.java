package com.example.table_de_multiplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnEffacer,btnAfficher,btnQuitter;
    EditText nbrSaisi;
    TextView textAfficher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Table De Multiplication ");
        btnEffacer = findViewById(R.id.btnEffacer);
        btnAfficher = findViewById(R.id.btnAfficher);
        btnQuitter = findViewById(R.id.btnQuitter);
        nbrSaisi = findViewById(R.id.nbrSaisi);
        textAfficher = findViewById(R.id.textAfficher);

        btnEffacer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nbrSaisi.setText("");
                textAfficher.setText("? * 0 = ? \n ? * 1 = ? \n ? * 2 = ? \n ? * 3 = ? \n ? * 4 = ? \n ? * 5 = ? \n ? * 6 = ? \n ? * 7 = ? \n ? * 8 = ? \n ? * 9 = ? \n ? * 10 = ?");
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