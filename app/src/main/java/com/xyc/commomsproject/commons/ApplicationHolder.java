package com.xyc.commomsproject.commons;

import android.content.Context;
import android.util.Log;

/**
 * Created by hasee on 2017/12/19.
 */

public class ApplicationHolder {
    private static Context mContext;

    public static void setAppContext(Context context) {
        if (context == null) {
           Log.e("ApplicationHolder", "try to set null application, return");
            return;
        }
        mContext = context;
    }

    public static Context getAppContext() {
        if (mContext == null) {
            Log.e("ApplicationHolder",
                    "Global ApplicationContext is null, Please call ApplicationHolder.setmApplication(application) at the onCreate() method of Activity and Application");
        }
        return mContext;
    }
}
