package com.chahar.cucumber.dto;

public class StockFeedDto {
    private String warehouse,updationType,comment;

    @Override
    public String toString() {
        return "StockFeedDto{" +
                "warehouse='" + warehouse + '\'' +
                ", updationType='" + updationType + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getUpdationType() {
        return updationType;
    }

    public void setUpdationType(String updationType) {
        this.updationType = updationType;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
