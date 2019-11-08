package com.example.bai_tp05;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

@Database(entities = {ModuleEntity.class}, version = 1)
public abstract class CursusDatabase extends RoomDatabase {

    private static volatile CursusDatabase INSTANCE;

    static CursusDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized ( CursusDatabase.class) {
                if (INSTANCE == null) {
                    // Create database here
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            CursusDatabase.class, "word_database")
                            .addCallback(sRoomDatabaseCallback)
                            .build();
                }
            }
        }
        return INSTANCE;
    }

    private static RoomDatabase.Callback sRoomDatabaseCallback =
            new RoomDatabase.Callback(){

                @Override
                public void onOpen (@NonNull SupportSQLiteDatabase db){
                    super.onOpen(db);
                    new PopulateDbAsync(INSTANCE).execute();
                }
            };

    private static class PopulateDbAsync extends AsyncTask<Void, Void, Void> {

        private final ModuleDAO mDao;

        PopulateDbAsync(CursusDatabase db) {
            mDao = db.moduleDao();
        }

        @Override
        protected Void doInBackground(final Void... params) {

            mDao.insert(new ModuleEntity("GL02", "TCBR", "CS", 6));
            mDao.insert(new ModuleEntity("NF16", "TCBR", "CS", 6));
            mDao.insert(new ModuleEntity("NF20", "TCBR", "CS", 6));
            mDao.insert(new ModuleEntity("IF09", "TCBR", "TM", 6));
            mDao.insert(new ModuleEntity("IF14", "TCBR", "TM", 6));
            mDao.insert(new ModuleEntity("LO02", "TCBR", "TM", 6));
            mDao.insert(new ModuleEntity("NF21", "TCBR", "TM", 6));

            mDao.insert(new ModuleEntity("IF02", "TCBR", "CS", 6));
            mDao.insert(new ModuleEntity("LO12", "TCBR", "CS", 6));
            mDao.insert(new ModuleEntity("IF08", "TCBR", "CS", 6));
            mDao.insert(new ModuleEntity("EG23", "TCBR", "TM", 6));
            mDao.insert(new ModuleEntity("IF03", "TCBR", "TM", 6));
            mDao.insert(new ModuleEntity("LO07", "TCBR", "TM", 6));
            mDao.insert(new ModuleEntity("NF19", "TCBR", "TM", 6));

            mDao.insert(new ModuleEntity("IF05", "MPL", "CS", 6));
            mDao.insert(new ModuleEntity("IF19", "MSI", "CS", 6));
            mDao.insert(new ModuleEntity("IF11", "MPL", "TM", 6));
            mDao.insert(new ModuleEntity("IF22", "MSI", "TM", 6));
            mDao.insert(new ModuleEntity("IF24", "MSI", "TM", 6));
            mDao.insert(new ModuleEntity("LO10", "MPL", "TM", 6));

            mDao.insert(new ModuleEntity("IF10", "MPL", "CS", 6));
            mDao.insert(new ModuleEntity("IF15", "MSI", "CS", 6));
            mDao.insert(new ModuleEntity("IF16", "MSI", "TM", 6));
            mDao.insert(new ModuleEntity("IF17", "MPL", "TM", 6));
            mDao.insert(new ModuleEntity("IF20", "MSI", "TM", 6));
            mDao.insert(new ModuleEntity("IF26", "MPL", "TM", 6));


            mDao.insert(new ModuleEntity("MCS1", "MCS", "CS", 3));
            mDao.insert(new ModuleEntity("MCS2", "MCS", "TM", 3));
            mDao.insert(new ModuleEntity("MCS3", "MCS", "TM", 3));
            mDao.insert(new ModuleEntity("MCS4", "MCS", "TM", 3));
            mDao.insert(new ModuleEntity("MCS5", "MCS", "TM", 3));
            mDao.insert(new ModuleEntity("MCS6", "MCS", "TM", 3));
            mDao.insert(new ModuleEntity("MCS7", "MCS", "TM", 3));
            mDao.insert(new ModuleEntity("MCS8", "MCS", "CS", 3));
            return null;
        }
    }
    public abstract ModuleDAO moduleDao();

    @NonNull
    @Override
    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
        return null;
    }

    @NonNull
    @Override
    protected InvalidationTracker createInvalidationTracker() {
        return null;
    }

    @Override
    public void clearAllTables() {

    }
}
