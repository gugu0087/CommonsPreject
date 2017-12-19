package com.xyc.commomsproject.db;

import android.database.sqlite.SQLiteDatabase;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.database.StandardDatabase;

/**
 * Created by hasee on 2017/12/19.
 */

public abstract class BaseDbManager<T> {
    protected AbstractDao dbDao;

    public BaseDbManager(AbstractDao dbDao) {
        this.dbDao = dbDao;
    }

    public SQLiteDatabase getDb() {
        StandardDatabase standardDatabase = (StandardDatabase) dbDao.getDatabase();
        return standardDatabase.getSQLiteDatabase();
    }
}
