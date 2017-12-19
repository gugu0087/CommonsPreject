package com.xyc.commomsproject.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.xyc.commomsproject.db.dao.DaoMaster;

import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.StandardDatabase;

/**
 * Created by hasee on 2017/12/19.
 */

public class DbOpenHelper extends DaoMaster.OpenHelper {
     private Context mContext;

    public DbOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);
        mContext = context;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Database database = new StandardDatabase(db);
        for(int i=oldVersion+1;i<=newVersion;i++){
            switch (i){
                case 1:
                    break;
                default:
                    break;

            }
        }
    }

}
