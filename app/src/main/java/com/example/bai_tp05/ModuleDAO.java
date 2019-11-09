package com.example.bai_tp05;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ModuleDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert (ModuleEntity module);

    @Query("DELETE FROM modules WHERE sigle=:sigle")
    void delete(String sigle);

    @Update
    void update(ModuleEntity module);

    @Query("SELECT * from modules ORDER BY sigle ASC")
    LiveData<List<ModuleEntity>> getAllModules();
}
