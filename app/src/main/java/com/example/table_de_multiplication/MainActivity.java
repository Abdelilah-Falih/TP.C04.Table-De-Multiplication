package com.example.table_de_multiplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnEffacer,btnAfficher,btnQuitter,btnColor1,btnColor2,btnColor3;
    EditText nbrSaisi;
    ConstraintLayout layoutT;
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
        btnAfficher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nbrSaisi.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Veuillez saisir un entier !!!", Toast.LENGTH_SHORT).show();
                    btnEffacer.callOnClick();
                    return;
                }
                int num = Integer.parseInt(nbrSaisi.getText().toString());
                StringBuffer txt = new StringBuffer();
                for (int i = 0; i <= 10; i++) {
                    txt.append(String.format("%d * %d = %d \n",num,i,num*i));
                }
                textAfficher.setText(txt);
            }
        });
    }
}