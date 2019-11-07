package com.example.bai_tp05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RoomModuleListeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_list);

        Cursus cursus = new Cursus();
        ArrayList<Module> modules = cursus.getModules();
        Intent intent = getIntent();
        if(intent.getExtras() != null){

            Bundle bundle = getIntent().getExtras();
            String sigle = bundle.getString("sigle");
            String parcours = bundle.getString("parcours");
            String categorie = bundle.getString("categorie");
            String credit = bundle.getString("credit");

            Module module = new Module(sigle, parcours, categorie, Integer.parseInt(credit));
            modules.add(module);
        }


        AdapteurModule adapter = new AdapteurModule(
                this,
                R.layout.module,
                modules
        );

        ListView lv = (ListView) findViewById(R.id.module_liste_tv);
        lv.setAdapter(adapter);
    }
}
