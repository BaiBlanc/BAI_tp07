package com.example.bai_tp05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RoomModuleAjouteActivity extends AppCompatActivity implements View.OnClickListener {

    String sigle;
    String parcours;
    String categorie;
    String credit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_module_ajoute);
        Button button = (Button)findViewById(R.id.room_ajoute_bt);
        button.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        sigle = ((EditText) findViewById(R.id.room_ajoute_sigle_et)).getText().toString();
        parcours = ((EditText) findViewById(R.id.room_ajoute_parcours_et)).getText().toString();
        categorie = ((EditText) findViewById(R.id.room_ajoute_categorie_et)).getText().toString();
        credit = ((EditText) findViewById(R.id.room_ajoute_credit_et)).getText().toString();

        Intent intent = new Intent(this, RoomModuleListeActivity.class);
        intent.putExtra("sigle",sigle);
        intent.putExtra("parcours",parcours);
        intent.putExtra("categorie",categorie);
        intent.putExtra("credit",credit);
        startActivity(intent);
    }
}
