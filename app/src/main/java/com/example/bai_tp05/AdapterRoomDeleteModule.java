package com.example.bai_tp05;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterRoomDeleteModule extends RecyclerView.Adapter<AdapterRoomDeleteModule.ModuleViewHolder> {

    class ModuleViewHolder extends RecyclerView.ViewHolder {
        private final RadioButton sigle_rb;



        private ModuleViewHolder(View itemView) {
            super(itemView);
            sigle_rb = (RadioButton) itemView.findViewById(R.id.radioButton);
            sigle_rb.sett
        }
    }

    private final LayoutInflater mInflater;
    private List<ModuleEntity> modules;

    AdapterRoomDeleteModule(Context context) {
        super();
        mInflater = LayoutInflater.from(context); }

    @NonNull
    @Override
    public AdapterRoomDeleteModule.ModuleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.module, parent, false);
        return new AdapterRoomDeleteModule.ModuleViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ModuleViewHolder holder, int position) {
        if (modules != null) {
            ModuleEntity current = modules.get(position);
            holder.sigle_rb.setText(current.getSigle());

        } else {
            // Covers the case of data not being ready yet.
            holder.sigle_rb.setText("No Word");

        }
    }

    void setModules(List<ModuleEntity> modules){
        this.modules = modules;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
