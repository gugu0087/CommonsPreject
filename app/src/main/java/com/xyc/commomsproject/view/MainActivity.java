package com.xyc.commomsproject.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.xyc.commomsproject.R;
import com.xyc.commomsproject.logic.presenter.LogicManager;
import com.xyc.commomsproject.logic.eventBus.TestEvent;
import com.xyc.commomsproject.logic.eventBus.UserEvent;
import com.xyc.commomsproject.logic.model.ResponseList;
import com.xyc.commomsproject.logic.model.TestModel;
import com.xyc.commomsproject.logic.model.UserEntry;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class MainActivity extends AppCompatActivity {

    private TextView sendResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EventBus.getDefault().register(this);
        sendResult = (TextView) findViewById(R.id.sendResult);

        initData();
    }

    @Subscribe(threadMode =ThreadMode.MAIN)
    public void onUserEntryEvent(UserEvent userEvent){
        ResponseList<UserEntry> userEntryResponseList = userEvent.getmUserEntry();

    }
    @Subscribe(threadMode =ThreadMode.MAIN)
    public void onGetResultEvent(TestEvent testEvent){

        TestModel testModel = testEvent.getmTestmodel();
        Log.d("xyc", "onGetResultEvent: testModel="+testModel);
    }

    private void initData() {
        LogicManager.getInstance().getUserResult();
        sendResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    protected void onDestroy() {
        EventBus.getDefault().unregister(this);
        super.onDestroy();

    }
}
