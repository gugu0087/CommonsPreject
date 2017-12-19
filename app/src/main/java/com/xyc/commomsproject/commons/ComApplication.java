package com.xyc.commomsproject.commons;

import android.app.Application;


/**
 * Created by hasee on 2017/12/19.
 */

public class ComApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ApplicationHolder.setAppContext(this);
    }

}
