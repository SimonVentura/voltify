package com.example.umlventura;

import android.content.Context;
import android.content.res.Resources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class gestore {

    String nomeFile;
    Context c;
    StringBuilder sB;

    public gestore(String nomeFile)
    {
        this.nomeFile = nomeFile;
    }
    public gestore(){

    };
    public String leggiFileRaw(Context c)
    {
        String testo="";
        StringBuilder sb = new StringBuilder();
        Resources res = c.getResources();
        InputStream is = res.openRawResource(R.raw.brani);
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        try {
            while ((testo = br.readLine()) != null) {
                sb.append(testo + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
}