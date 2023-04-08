package com.example.uitask;

import static com.example.uitask.MainActivity.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    public static RetrofitInstance retrofitInstance;
    ApiInterface apiInterface;

    RetrofitInstance(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(api)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

       apiInterface = retrofit.create(ApiInterface.class);

    }

    public static RetrofitInstance getRetrofitInstance() {
        if(retrofitInstance==null){
            retrofitInstance = new RetrofitInstance();
        }
        return retrofitInstance;
    }
}
