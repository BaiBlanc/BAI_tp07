package com.example.bai_tp05;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterRoomDeleteModule extends RecyclerView.Adapter<AdapterRoomDeleteModule.ModuleViewHolder> {


    private int checked_index = -1;
    private int unckecked_index = -1;
    private Context context;
    private TreeSet<String> checkedRadiosSigle = new TreeSet<String>();

    class ModuleViewHolder extends RecyclerView.ViewHolder {
        private final CheckBox sigle_rb;



        private ModuleViewHolder(View itemView) {
            super(itemView);
            sigle_rb = (CheckBox) itemView.findViewById(R.id.checkBox);

        }
    }

    private final LayoutInflater mInflater;
    private List<ModuleEntity> modules;

    AdapterRoomDeleteModule(Context context) {
        super();
        this.context = context;
        mInflater = LayoutInflater.from(context);

    }

    @NonNull
    @Override
    public AdapterRoomDeleteModule.ModuleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.delete_recycle_item, parent, false);
        return new AdapterRoomDeleteModule.ModuleViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ModuleViewHolder holder, final int position) {
        if (modules != null) {
            ModuleEntity current = modules.get(position);
            holder.sigle_rb.setText(current.getSigle());

            holder.sigle_rb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked){
                        Toast.makeText(context,"You have chosen"+modules.get(position),Toast.LENGTH_SHORT).show();
                        checked_index = position;
//                        notifyDataSetChanged();
                        checkedRadiosSigle.add(modules.get(checked_index).getSigle());

                    }else if(!isChecked){
//                        notifyDataSetChanged();
                        unckecked_index = position;

                        checkedRadiosSigle.remove(modules.get(unckecked_index).getSigle());
                    }

                }



            });

            if(checked_index==position){
                holder.sigle_rb.setChecked(true);


            } else {
                holder.sigle_rb.setChecked(false);
            }
//            if(unckecked_index == position){
//                holder.sigle_rb.setChecked(false);
//            }
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
        if (modules != null)
            return modules.size();
        else return 0;
    }

    public TreeSet<String> getChecked(){
        return this.checkedRadiosSigle;
    }
}
