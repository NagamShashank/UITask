package com.example.uitask;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("/testdata.json")


    Call<List<Model>> getUsers();

}
