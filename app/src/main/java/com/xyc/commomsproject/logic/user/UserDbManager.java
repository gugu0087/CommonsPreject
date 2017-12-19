package com.xyc.commomsproject.logic.user;

import android.database.sqlite.SQLiteDatabase;

import com.xyc.commomsproject.db.BaseDbManager;
import com.xyc.commomsproject.db.dao.UserDao;
import com.xyc.commomsproject.logic.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hasee on 2017/12/19.
 */

public class UserDbManager extends BaseDbManager {

    private UserDao mUserDao;
    private SQLiteDatabase db;

    public UserDbManager(UserDao userDao) {
        super(userDao);
        mUserDao = userDao;
        db = getDb();
    }

   public List<User> getUserList(){
       ArrayList<User> users = new ArrayList<>();
       return users;
   }
}
