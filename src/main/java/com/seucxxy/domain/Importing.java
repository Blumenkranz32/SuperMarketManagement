package com.seucxxy.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Importing {
    private String id;
    private String name;
    private String band;
    private float price;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date importtime;

    public Importing() {
    }

    @Override
    public String toString() {
        return "Importing{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", band='" + band + '\'' +
                ", price=" + price +
                ", time=" + importtime +
                '}';
    }

    public Importing(String id, String name, String band, float price, Date importtime) {
        this.id = id;
        this.name = name;
        this.band = band;
        this.price = price;
        this.importtime = importtime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getImporttime() {
        return importtime;
    }

    public void setImporttime(Date importtime) {
        this.importtime = importtime;
    }
}
