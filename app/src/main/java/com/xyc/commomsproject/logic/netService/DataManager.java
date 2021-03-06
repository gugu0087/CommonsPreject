package com.xyc.commomsproject.logic.netService;

import com.xyc.commomsproject.commons.CommonUrl;

import java.util.Map;

/**
 * Created by hasee on 2017/12/13.
 */

public class DataManager {

    public static DataManager instance = null;
    private static RetrofitClient mRetrofitClient;
    private NetApiService apiService;

    public DataManager() {
        mRetrofitClient = new RetrofitClient(CommonUrl.URL);
        apiService = mRetrofitClient.create(NetApiService.class);
    }

    public static DataManager getInstance() {
        if (instance == null) {
            instance = new DataManager();
        }
        return instance;
    }

    public static void updateQueryParams(Map<String, String> params) {
        mRetrofitClient.updateQueryParams(params);
    }
     public NetApiService getApiService(){
         return apiService;
     }
}
