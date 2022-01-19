package com.example.provamusica;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnInsert;
    EditText edtSongName;
    GestoreBrani gb;


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnInsert = (Button) findViewById(R.id.invia);
        edtSongName = (EditText) findViewById(R.id.inserimento);
        gb = new GestoreBrani();
        Brano b =new Brano("","","");
        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gb.addBrano(b);
            }
        });
    }
}