package com.example.uitask.DataModels;

public class ModelRecord {

    int Id,collectedValue,totalValue;
    String title,shortDescription,startDate,endDate,mainImageURL;

    public ModelRecord(int id, int collectedValue, int totalValue, String title, String shortDescription, String startDate, String endDate, String mainImageURL) {
        Id = id;
        this.collectedValue = collectedValue;
        this.totalValue = totalValue;
        this.title = title;
        this.shortDescription = shortDescription;
        this.startDate = startDate;
        this.endDate = endDate;
        this.mainImageURL = mainImageURL;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getCollectedValue() {
        return collectedValue;
    }

    public void setCollectedValue(int collectedValue) {
        this.collectedValue = collectedValue;
    }

    public int getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(int totalValue) {
        this.totalValue = totalValue;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getMainImageURL() {
        return mainImageURL;
    }

    public void setMainImageURL(String mainImageURL) {
        this.mainImageURL = mainImageURL;
    }
}
