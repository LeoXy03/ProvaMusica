package com.example.provamusica;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Brano {
    private String titolo;
    private String autore;
    private String genere;
    //private LocalDate dataPubblicazione;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Brano(String t, String a, String g) {
        titolo=t;
        autore=a;
        genere=g;
        //dataPubblicazione = LocalDate.parse(d, DateTimeFormatter.ofPattern("d/MM/yyyy"));
    }

}
