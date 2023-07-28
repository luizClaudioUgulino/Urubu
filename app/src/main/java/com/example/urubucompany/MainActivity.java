package com.example.urubucompany;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.filament.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void sortearNumero(android.view.View view) {
        TextView texto = findViewById(R.id.textoResultado);
        texto.setText("5");
    }
}