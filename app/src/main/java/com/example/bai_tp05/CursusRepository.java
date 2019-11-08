package com.example.bai_tp05;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

public class CursusRepository {


    private LiveData<List<ModuleEntity>>  modules;
    private ModuleDAO moduleDAO;

    CursusRepository(Application application) {
        CursusDatabase db = CursusDatabase.getDatabase(application);
        moduleDAO = db.moduleDao();
        modules = moduleDAO.getAllModules();
    }

    LiveData<List<ModuleEntity>> getAllModules(){

        return modules;
    }

    public void insert (ModuleEntity me){
        new insertAsyncTask(moduleDAO).execute(me);

    }

    public void delete(String sigle){
        new deleteAsyncTask(moduleDAO).execute(sigle);
    }

    private static class insertAsyncTask extends AsyncTask<ModuleEntity, Void, Void> {

        private ModuleDAO mAsyncTaskDao;

        insertAsyncTask(ModuleDAO dao) {
            mAsyncTaskDao = dao;
        }


        protected Void doInBackground(final ModuleEntity... params) {
            mAsyncTaskDao.insert(params[0]);
            return null;
        }
    }

    private static class deleteAsyncTask extends AsyncTask<String, Void, Void> {

        private ModuleDAO mAsyncTaskDao;

        deleteAsyncTask(ModuleDAO dao) {
            mAsyncTaskDao = dao;
        }


        protected Void doInBackground(final String... params) {
            mAsyncTaskDao.delete(params[0]);
            return null;
        }
    }
}
