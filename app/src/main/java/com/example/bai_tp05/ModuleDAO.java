package com.example.bai_tp05;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;

@Dao
public interface ModuleDAO {

    @Insert
    void insert (Module module);

    @Delete
    void delete(Module module);

    @Update
    void update(Module module);
}
