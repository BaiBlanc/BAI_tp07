package com.example.bai_tp05;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AdapteurModule extends ArrayAdapter {


    ArrayList<Module> moduleList;
    int resource;
    Context c;

    public AdapteurModule(Context context, int resource, ArrayList<Module> modules) {
        super(context, resource, modules);
        this.moduleList = modules;
        this.resource = resource;
        this.c = context;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = ((Activity) c).getLayoutInflater();
        View v = inflater.inflate(resource, parent, false);
        Module module = moduleList.get(position);
        TextView sigle_tv = (TextView) v.findViewById(R.id.module_tv1);
        TextView cat_tv = (TextView) v.findViewById(R.id.module_tv2);
        TextView parcours_tv = (TextView) v.findViewById(R.id.module_tv3);
        TextView credit_tv = (TextView) v.findViewById(R.id.module_tv4);
        sigle_tv.setText(module.getSigle());
        cat_tv.setText(module.getCategorie());
        parcours_tv.setText(module.getParcours());
        credit_tv.setText(Integer.toString(module.getCredit()));
        return v;
    }
}
