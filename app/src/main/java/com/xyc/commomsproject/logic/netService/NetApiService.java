package com.xyc.commomsproject.logic.netService;


import com.xyc.commomsproject.logic.model.TestModel;

import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;


/**
 * Created by hasee on 2017/12/12.
 */

public interface NetApiService {


  @POST("/heartbeat/taskNotify")
  //Observable<ResponseList<UserEntry>> getUserData(@Query("userName") String userName, @Query("password") String password);
  Observable<TestModel> getResult(@Query("machineId") String machineId, @Query("taskId")String taskId, @Query("result") String result, @Query("reqTime") String reqTime, @Query("taskType") String taskType);
}
