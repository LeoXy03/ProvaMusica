package com.example.provamusica;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;

public class GestoreBrani {
    private ArrayList<Brano> brani;

    public GestoreBrani(){
        brani=new ArrayList<Brano>();
    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    public void addBrano(Brano b) {
       brani.add(b);
    }

}
