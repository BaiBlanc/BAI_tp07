package com.example.bai_tp05;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RoomModuleListeActivity extends AppCompatActivity {

    private ModuleViewModel mvm;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_module_liste);

        mvm = new ViewModelProvider(this).get(ModuleViewModel.class);


        // CursusEntity cursus = new CursusEntity();
        // ArrayList<ModuleEntity> modules = cursus.getModules();
        Intent intent = getIntent();
        if(intent.getExtras() != null){


            Bundle bundle = getIntent().getExtras();
            String activity = bundle.getString("activity");

            String sigle;
            String parcours;
            String categorie;
            String credit;
            String[] sigles_to_delete;
            if(activity.equals("Add")){

                sigle = bundle.getString("sigle");
                 parcours = bundle.getString("parcours");
                 categorie = bundle.getString("categorie");
                 credit = bundle.getString("credit");
                ModuleEntity module = new ModuleEntity(sigle, parcours, categorie, Integer.parseInt(credit));
                // modules.add(module);
                mvm.insert(module);
            }else if(activity.equals("delete")){

                 sigles_to_delete = bundle.getStringArray("sigle");
                 for(String s : sigles_to_delete){
                     mvm.delete(s);
                 }

            }




        }


        /*AdapteurModule adapter = new AdapteurModule(
                this,
                R.layout.module,
                modules
        );
        */


        // ListView lv = (ListView) findViewById(R.id.module_liste_tv);
        // lv.setAdapter(adapter);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerview1);
        final AdapteurRoomModule adapter = new AdapteurRoomModule(this);


        recyclerView.setAdapter(adapter);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        mvm.getAllModules().observe(this, new Observer<List<ModuleEntity>>() {
            @Override
            public void onChanged(@Nullable final List<ModuleEntity> modules) {
                // Update the cached copy of the words in the adapter.
                adapter.setModules(modules);
            }
        });
    }
}
