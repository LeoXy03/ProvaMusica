package com.example.provamusica;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnInsert;
    EditText edtSongName;
    GestoreBrani gb;
    Spinner spnGeneri;
    ArrayAdapter <String> aG;

    String[] generi = {"hip pop", "trap", "rap"};

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnInsert = (Button) findViewById(R.id.invia);
        edtSongName = (EditText) findViewById(R.id.inserimento);
        spnGeneri = (Spinner)findViewById(R.id.genere);
        gb = new GestoreBrani();
        aG = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,generi);
        spnGeneri.setAdapter(aG);
        Brano b =new Brano("","","");
        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String genselezionato = spnGeneri.getSelectedItem().toString();
                Toast.makeText(getApplicationContext(),genselezionato,Toast.LENGTH_LONG).show();
                gb.addBrano(b);

            }
        });
    }
}