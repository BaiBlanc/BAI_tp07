package com.example.bai_tp05;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AdapteurRoomModule extends RecyclerView.Adapter<AdapteurRoomModule.ModuleViewHolder> {
//public class AdapteurRoomModule extends ArrayAdapter{
    class ModuleViewHolder extends RecyclerView.ViewHolder {
        private final TextView sigle_tv;
        private final TextView parcours_tv;
        private final TextView categorie_tv;
        private final TextView credit_tv;




        private ModuleViewHolder(View itemView) {
            super(itemView);
            sigle_tv = itemView.findViewById(R.id.module_tv1);
            parcours_tv = itemView.findViewById(R.id.module_tv2);
            categorie_tv = itemView.findViewById(R.id.module_tv3);
            credit_tv = itemView.findViewById(R.id.module_tv4);

        }
    }

    private final LayoutInflater mInflater;
    private List<ModuleEntity> modules;
    int resource;
    Context c;
/*
    public AdapteurRoomModule(Context context, int resource, ArrayList<ModuleEntity> modules) {
        super(context, resource, modules);
        this.modules = modules;
        this.resource = resource;
        this.c = context;
        mInflater = LayoutInflater.from(context);
    }
    */

   AdapteurRoomModule(Context context) {
        super();
        mInflater = LayoutInflater.from(context); }


    public ModuleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.module_recycle_item, parent, false);
        return new ModuleViewHolder(itemView);
    }


    public void onBindViewHolder(ModuleViewHolder holder, int position) {
        if (modules != null) {
            ModuleEntity current = modules.get(position);
            holder.sigle_tv.setText(current.getSigle());
            holder.parcours_tv.setText(current.getParcours());
            holder.categorie_tv.setText(current.getCategorie());
            holder.credit_tv.setText(Integer.toString(current.getCredit()));
        } else {
            // Covers the case of data not being ready yet.
            holder.sigle_tv.setText("No Word");
            holder.parcours_tv.setText("No Word");
            holder.categorie_tv.setText("No Word");
            holder.credit_tv.setText("No Word");
        }
    }

    void setModules(List<ModuleEntity> modules){
        this.modules = modules;
        notifyDataSetChanged();
    }

    // getItemCount() is called many times, and when it is first called,
    // mWords has not been updated (means initially, it's null, and we can't return null).

    public int getItemCount() {
        if (modules != null)
            return modules.size();
        else return 0;
    }
}


