package com.example.uitask.DataModels;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ModelData {

    int TotalRecords;
    ArrayList<ModelRecord> Records;

    public ModelData(int totalRecords, ArrayList<ModelRecord> records) {
        TotalRecords = totalRecords;
        Records = records;
    }

    public int getTotalRecords() {
        return TotalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        TotalRecords = totalRecords;
    }

    public ArrayList<ModelRecord> getRecords() {
        return Records;
    }

    public void setRecords(ArrayList<ModelRecord> records) {
        Records = records;
    }

//    @SerializedName("Records")
//    private ModelRecord modelRecord;
//
//    public ModelData(ModelRecord modelRecord) {
//        this.modelRecord = modelRecord;
//    }
//
//    public ModelRecord getModelRecord() {
//        return modelRecord;
//    }
//
//    public void setModelRecord(ModelRecord modelRecord) {
//        this.modelRecord = modelRecord;
//    }
}
