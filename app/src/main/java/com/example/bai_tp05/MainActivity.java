package com.example.bai_tp05;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Object Menu;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.menu1_sigle_liste:
                sigleListe();
                return true;
            case R.id.menu1_sigle_ajoute:
                sigleAjoute();
                return true;
            case R.id.menu1_sigle_supprime:
                sigleSupprime();
                return true;
            case R.id.menu1_module_liste:
                moduleListe();
                return true;
            case R.id.menu1_module_ajoute:
                moduleAjoute();
                return true;
            case R.id.menu1_module_supprime:
                moduleSupprime();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void sigleListe(){
        Toast.makeText(this,"Je veux la liste des sigles​", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, SigleListeActivity.class);
        startActivity(intent);
    }
    private void sigleAjoute(){
        Toast.makeText(this,"Je veux la liste des sigles​", Toast.LENGTH_LONG).show();
    }
    private void sigleSupprime(){
        Toast.makeText(this,"Je veux la liste des sigles​", Toast.LENGTH_LONG).show();
    }
    private void moduleListe(){
        Toast.makeText(this,"Je veux la liste des sigles​", Toast.LENGTH_LONG).show();
    }
    private void moduleAjoute(){
        Toast.makeText(this,"Je veux la liste des sigles​", Toast.LENGTH_LONG).show();
    }
    private void moduleSupprime(){
        Toast.makeText(this,"Je veux la liste des sigles​", Toast.LENGTH_LONG).show();
    }

}
