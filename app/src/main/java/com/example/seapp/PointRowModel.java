package com.example.seapp;

public class PointRowModel {
    String date = "";
    String name = "";
    String status = "";

    public PointRowModel(String date, String name, String status) {
        this.date = date;
        this.name = name;
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
