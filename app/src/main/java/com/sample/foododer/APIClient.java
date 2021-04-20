package com.sample.foododer;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {

    private static Retrofit retrofit;

    public  static Retrofit getClient(){

        retrofit = new Retrofit.Builder()
                .baseUrl("https://staging.pearpartner.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }
}
