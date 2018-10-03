package com.example.truco.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.truco.R;

public class MainActivity extends AppCompatActivity {

    private EditText nomeDupla;
    private EditText qtdeVitorias;
    private EditText qtdeDerrotas;
    private Button cadastarPartidas;
    private ListView listaPartidas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
