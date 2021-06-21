package com.geektech.a3homework21.data.remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitFactory {
    public RetrofitFactory(){}
    private static GhibliAPI instance;
    public static GhibliAPI getInstance(){
        if (instance == null){
            instance = new Retrofit.Builder()
                    .baseUrl(BuildConfig.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build().create(GhibliAPI.class);
        }
        return  instance;
    }
}
