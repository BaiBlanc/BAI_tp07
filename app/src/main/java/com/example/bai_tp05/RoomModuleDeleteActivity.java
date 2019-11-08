package com.example.bai_tp05;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RoomModuleDeleteActivity extends AppCompatActivity implements View.OnClickListener{

    String sigle;

    private ModuleViewModel mvm;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_module_delete);

        mvm = new ViewModelProvider(this).get(ModuleViewModel.class);

        Button button = (Button)findViewById(R.id.delete_bt);
        button.setOnClickListener(
                this
        );
    }

    @Override
    public void onClick(View view) {

    }
}
