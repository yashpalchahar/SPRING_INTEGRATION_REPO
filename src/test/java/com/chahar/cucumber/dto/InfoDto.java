package com.chahar.cucumber.dto;

public class InfoDto {
    private String info,comment,email;

    @Override
    public String toString() {
        return "InfoDto{" +
                "info='" + info + '\'' +
                ", comment='" + comment + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
