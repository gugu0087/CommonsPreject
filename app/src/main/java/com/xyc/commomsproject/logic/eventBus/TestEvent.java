package com.xyc.commomsproject.logic.eventBus;

import com.xyc.commomsproject.logic.model.TestModel;

/**
 * Created by hasee on 2017/12/18.
 */

public class TestEvent {
    private TestModel mTestmodel;
    public TestEvent(TestModel testModel){
        mTestmodel =testModel;
    }

    public TestModel getmTestmodel() {
        return mTestmodel;
    }
}
