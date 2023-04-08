package com.example.uitask;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.uitask.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    //   /testdata.json

    ActivityMainBinding binding;

    public static String api = "https://testffc.nimapinfotech.com";


    List<Model> Userlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        binding.RecyclerView.setLayoutManager(layoutManager);




        RetrofitInstance.getRetrofitInstance().apiInterface.getUsers().enqueue(new Callback<List<Model>>() {
            @Override
            public void onResponse(@NonNull Call<List<Model>> call, @NonNull Response<List<Model>> response) {
                Userlist.addAll(response.body());
                //Log.e("api","Failure" + response.body());
                RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(Userlist, MainActivity.this);
                binding.RecyclerView.setAdapter(recyclerViewAdapter);
                recyclerViewAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(@NonNull Call<List<Model>> call, Throwable t) {
                Log.e("api","Failure" + t.getLocalizedMessage());
            }
        });



        /*
        binding.RecyclerView.setHasFixedSize(true);

        ArrayList<Model> list = new ArrayList<>();

        list.add(new Model(R.drawable.project1,"2","Hello","This is Short Description","400","6000","01/03/2023","31/03/2023"));
        list.add(new Model(R.drawable.project2,"2","Hello","This is Short Description","300","3000","01/02/2023","31/03/2023"));
        list.add(new Model(R.drawable.project3,"2","Hello","This is Short Description","450","8000","01/01/2023","31/03/2023"));
        list.add(new Model(R.drawable.project4,"2","Hello","This is Short Description","900","9000","01/03/2023","31/03/2023"));
        list.add(new Model(R.drawable.project5,"2","Hello","This is Short Description","200","1000","01/03/2023","31/03/2023"));
        list.add(new Model(R.drawable.project6,"2","Hello","This is Short Description","180","7000","01/03/2023","31/03/2023"));

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(list,this);
        binding.RecyclerView.setAdapter(recyclerViewAdapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        binding.RecyclerView.setLayoutManager(layoutManager);

        */

    }
}