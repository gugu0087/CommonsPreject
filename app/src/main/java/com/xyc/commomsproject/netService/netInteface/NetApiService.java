package com.xyc.commomsproject.netService.netInteface;

import com.xyc.commomsproject.model.MaintainBoardsDto;

import java.util.List;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by hasee on 2017/12/12.
 */

public interface NetApiService {
  //@FormUrlEncoded
  //@POST("login/login.json")
  //Observable<ResData<UserDTO>> login(@Field("loginName") String loginName, @Field("password") String password, @Field("serialNumber") String serialNumber);
  @GET("/service/check/getWxMaintainBoards.json")
  Observable<List<MaintainBoardsDto>> getMaintainBordsList(@Query("compcode") String compcode, @Query("pageSize") int pageSize, @Query("status") int status);

}
