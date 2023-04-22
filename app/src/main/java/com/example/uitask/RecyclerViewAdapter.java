package com.example.uitask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uitask.DataModels.MainModel;
import com.example.uitask.DataModels.ModelRecord;
import com.example.uitask.databinding.ItemLayoutBinding;

import java.util.List;

import retrofit2.Callback;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    List<MainModel> userlist;
    Context context;

    public RecyclerViewAdapter(List<MainModel> userlist,Context context) {
        this.userlist = userlist;
        //this.mainActivity =  mainActivity;
        this.context = context;
    }

    /* public RecyclerViewAdapter(ArrayList<Model> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    } */


    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ItemLayoutBinding binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {



        holder.binding.Title.setText(userlist.get(position).getModelData().getRecords().get(0).getTitle());
    }

    @Override
    public int getItemCount() {
        return userlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ItemLayoutBinding binding;

        public ViewHolder(@NonNull ItemLayoutBinding itemLayoutBinding) {
            super(itemLayoutBinding.getRoot());

            binding = itemLayoutBinding;

        }
    }
}
