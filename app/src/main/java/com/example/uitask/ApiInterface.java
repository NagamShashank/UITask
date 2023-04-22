package com.example.uitask;

import com.example.uitask.DataModels.MainModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    // https://run.mocky.io/v3/83d8dbbe-ce21-4268-a653-9280b5a04f2b

    // https://testffc.nimapinfotech.com/testdata.json

    @GET("v3/883e57df-e77a-418a-90c7-4150e3ce88db")

    Call<List<MainModel>> getUsers();

}
