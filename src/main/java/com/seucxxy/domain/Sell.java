package com.seucxxy.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Sell {

//    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private String whichdate;

    private double income;

    private String remarks;

    @Override
    public String toString() {
        return "Sell{" +
                "whichdate=" + whichdate +
                ", income=" + income +
                ", remarks='" + remarks + '\'' +
                '}';
    }

    public Sell() {
    }

    public Sell(String whichdate, double income, String remarks) {
        this.whichdate = whichdate;
        this.income = income;
        this.remarks = remarks;
    }

    public String getWhichdate() {
        return whichdate;
    }

    public void setWhichdate(String whichdate) {
        this.whichdate = whichdate;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
