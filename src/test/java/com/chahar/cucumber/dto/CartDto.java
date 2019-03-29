package com.chahar.cucumber.dto;

public class CartDto {
    String product;
    Integer quantity;
    String userId;

    @Override
    public String toString() {
        return "CartDto{" +
                "product='" + product + '\'' +
                ", quantity=" + quantity +
                ", userId='" + userId + '\'' +
                '}';
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
