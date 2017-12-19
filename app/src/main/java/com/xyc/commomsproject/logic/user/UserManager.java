package com.xyc.commomsproject.logic.user;

import com.xyc.commomsproject.logic.eventBus.TestEvent;
import com.xyc.commomsproject.logic.model.TestModel;
import com.xyc.commomsproject.logic.netService.DataManager;
import com.xyc.commomsproject.logic.netService.LoadRxSubscriber;

import org.greenrobot.eventbus.EventBus;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by hasee on 2017/12/19.
 */

public class UserManager {

    public static UserManager instance = null;

    private UserManager() {

    }

    public static UserManager getInstance() {
        if (instance == null) {
            instance = new UserManager();
        }
        return instance;
    }

    public void getUserResult() {
        DataManager.getInstance().getApiService().getResult("358336123811961", "112", "1", "1513584538340", "110")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new LoadRxSubscriber<TestModel>() {
                    @Override
                    protected void onSuccess(TestModel response) {
                        EventBus.getDefault().post(new TestEvent(response));
                    }

                    @Override
                    public void onError(Throwable ex) {
                        super.onError(ex);
                    }
                });
    }
}
