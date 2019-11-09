package com.example.bai_tp05;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class RoomModuleDeleteActivity extends AppCompatActivity implements View.OnClickListener{

    String sigle;

    private ModuleViewModel mvm;
    private RecyclerView recyclerView;
    private AdapterRoomDeleteModule adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_module_delete);

        mvm = new ViewModelProvider(this).get(ModuleViewModel.class);

        recyclerView = (RecyclerView) findViewById(R.id.delete_rv);
        adapter = new AdapterRoomDeleteModule(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Button button = (Button)findViewById(R.id.delete_bt);
        button.setOnClickListener(
                this
        );

        mvm.getAllModules().observe(this, new Observer<List<ModuleEntity>>() {
            @Override
            public void onChanged(@Nullable final List<ModuleEntity> modules) {
                // Update the cached copy of the words in the adapter.
                adapter.setModules(modules);
            }
        });
    }

    @Override
    public void onClick(View view) {
        TreeSet<String> sigles = adapter.getChecked();
        Toast.makeText(this,"Your choice(s) to delete is"+sigles.toString(),Toast.LENGTH_SHORT).show();

        Object[] objects = sigles.toArray();
        String[] sigles_array = new String[objects.length+1];
        for(int i=0; i<objects.length;i++){
            sigles_array[i] = objects[i].toString();
        }
        Intent intent = new Intent(this, RoomModuleListeActivity.class);
        intent.putExtra("sigle", sigles_array);
        intent.putExtra("activity","delete");
        startActivity(intent);

    }
}
