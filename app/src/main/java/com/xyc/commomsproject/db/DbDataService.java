package com.xyc.commomsproject.db;

import android.database.sqlite.SQLiteDatabase;

import com.xyc.commomsproject.commons.ApplicationHolder;
import com.xyc.commomsproject.db.dao.DaoMaster;
import com.xyc.commomsproject.db.dao.DaoSession;
import com.xyc.commomsproject.logic.model.User;
import com.xyc.commomsproject.logic.user.UserDbManager;

/**
 * Created by hasee on 2017/12/19.
 */

public class DbDataService {
    private static final String DB_NAME = "logic-db";
    public static DbDataService instance = null;
    private final DaoMaster daoMaster;
    private final DaoSession daoSession;

    public static DbDataService getInstance() {
        if (instance == null) {
            instance = new DbDataService();
        }
        return instance;
    }

    private DbDataService() {
        DbOpenHelper helper = new DbOpenHelper(ApplicationHolder.getAppContext(), DB_NAME, null);
        helper.setWriteAheadLoggingEnabled(true);
        SQLiteDatabase db = helper.getWritableDatabase();
        daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();

    }

    private UserDbManager userDbManager;

    public UserDbManager getUserDbManager() {
        if (userDbManager == null) {
            userDbManager = new UserDbManager(daoSession.getUserDao());
        }
        return userDbManager;
    }

}
