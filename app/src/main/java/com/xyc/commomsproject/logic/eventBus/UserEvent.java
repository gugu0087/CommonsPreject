package com.xyc.commomsproject.logic.eventBus;

import com.xyc.commomsproject.logic.model.ResponseList;
import com.xyc.commomsproject.logic.model.UserEntry;

/**
 * Created by hasee on 2017/12/18.
 */

public class UserEvent {
    private ResponseList<UserEntry> mUserEntry;

    public UserEvent(ResponseList<UserEntry> userEntry) {
        mUserEntry = userEntry;
    }

    public ResponseList<UserEntry> getmUserEntry() {
        return mUserEntry;
    }
}
