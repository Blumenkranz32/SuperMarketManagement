package com.seucxxy.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class GoodsTime {

    private String id;
    private String batch;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date starttime;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date endtime;

    @Override
    public String toString() {
        return "GoodsTime{" +
                "id='" + id + '\'' +
                ", batch='" + batch + '\'' +
                ", starttime=" + starttime +
                ", endtime=" + endtime +
                '}';
    }

    public GoodsTime() {
    }

    public GoodsTime(String id, String batch, Date starttime, Date endtime) {
        this.id = id;
        this.batch = batch;
        this.starttime = starttime;
        this.endtime = endtime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }
}
