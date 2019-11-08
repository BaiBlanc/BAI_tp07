package com.example.bai_tp05;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterRoomDeleteModule extends RecyclerView.Adapter<AdapteurRoomModule.ModuleViewHolder> {

    class ModuleViewHolder extends RecyclerView.ViewHolder {
        private final TextView sigle_tv;



        private ModuleViewHolder(View itemView) {
            super(itemView);
            sigle_tv = itemView.findViewById(R.id.delete_bt);

        }
    }



    @NonNull
    @Override
    public AdapteurRoomModule.ModuleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapteurRoomModule.ModuleViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
