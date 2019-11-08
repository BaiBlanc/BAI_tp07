package com.example.bai_tp05;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class ModuleViewModel extends AndroidViewModel {

    private CursusRepository cursusRepository;
    private LiveData<List<ModuleEntity>> allModules;

    public ModuleViewModel(@NonNull Application application) {
        super(application);
        cursusRepository = new CursusRepository(application);
        allModules = cursusRepository.getAllModules();
    }

    LiveData<List<ModuleEntity>> getAllModules(){
        return allModules;
    }

    public void insert(ModuleEntity me){ cursusRepository.insert(me); }

    public void delete(String sigle){
        cursusRepository.delete(sigle);
    }

}
