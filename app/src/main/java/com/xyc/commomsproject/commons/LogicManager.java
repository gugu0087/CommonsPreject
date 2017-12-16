package com.xyc.commomsproject.commons;

import com.xyc.commomsproject.model.MaintainBoardsDto;
import com.xyc.commomsproject.netService.netInteface.RxSubscriber;
import com.xyc.commomsproject.netService.netManager.DataManager;

import java.util.List;

import rx.subjects.ReplaySubject;

/**
 * Created by hasee on 2017/12/14.
 */

public class LogicManager {
    public static LogicManager instance = null;
    private LogicManager(){

    }
    public static LogicManager getInstance(){
        if(instance == null){
            instance = new LogicManager();
        }
        return instance;
    }
    public void  getMainData(){
        DataManager.getInstance().getApiService().getMaintainBordsList("1",10,1).subscribe(new RxSubscriber<List<MaintainBoardsDto>>() {
            @Override
            protected void onSuccess(List<MaintainBoardsDto> response) {

            }
        });
    }
}
