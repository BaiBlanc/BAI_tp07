package com.example.bai_tp05;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class RoomModuleDeleteActivity extends AppCompatActivity implements View.OnClickListener{

    String sigle;

    private ModuleViewModel mvm;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_module_delete);

        mvm = new ViewModelProvider(this).get(ModuleViewModel.class);

        recyclerView = (RecyclerView) findViewById(R.id.delete_rv);
        final AdapterRoomDeleteModule adapter = new AdapterRoomDeleteModule(this);

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

    }
}
