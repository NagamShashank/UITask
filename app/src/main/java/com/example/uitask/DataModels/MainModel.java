package com.example.uitask.DataModels;

import com.google.gson.annotations.SerializedName;

public class MainModel {
    int Status;
    String Message;

    public MainModel(int status, String message) {
        Status = status;
        Message = message;

    }


    @SerializedName("data")
        private ModelData modelData;

    public MainModel(ModelData modelData) {
        this.modelData = modelData;
    }

    public ModelData getModelData() {
        return modelData;
    }

    public void setModelData(ModelData modelData) {
        this.modelData = modelData;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
