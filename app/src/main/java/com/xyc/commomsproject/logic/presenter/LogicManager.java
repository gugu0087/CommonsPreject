package com.xyc.commomsproject.logic.presenter;

import com.xyc.commomsproject.db.DbDataService;
import com.xyc.commomsproject.logic.model.User;
import com.xyc.commomsproject.logic.user.UserManager;
import java.util.List;


/**
 * Created by hasee on 2017/12/14.
 */

public class LogicManager {

    public static LogicManager instance = null;

    private LogicManager() {

    }

    public static LogicManager getInstance() {
        if (instance == null) {
            instance = new LogicManager();
        }
        return instance;
    }

    public void getUserResult() {
        UserManager.getInstance().getUserResult();
    }

    public List<User> getUserList() {
        List<User> userList = DbDataService.getInstance().getUserDbManager().getUserList();
        return userList;
    }
}
