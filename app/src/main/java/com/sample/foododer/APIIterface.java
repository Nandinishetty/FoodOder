package com.sample.foododer;

import com.sample.foododer.pojo.Data;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIIterface {

    //Field,QUERY ,BODY,PATH
    @GET("/order/607a7b89142d753f1c9e56dc/details")
    Call<Data> setData();
}
