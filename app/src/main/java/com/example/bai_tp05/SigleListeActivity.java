package com.example.bai_tp05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

public class SigleListeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigle_liste);

        List<String> liste= Arrays.asList("NF16","NF20","LO02","LO07","NF19","IF26","IF10","EG23","LO12","IF02","MCS1");
        AdapteurSigle adapter = new AdapteurSigle(
                this,
                R.layout.sigle,
                liste
                );

        ListView lv = (ListView) findViewById(R.id.sigle_liste_lv);
        lv.setAdapter(adapter);
    }
}
